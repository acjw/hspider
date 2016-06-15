var app = angular.module('admin', ['ngRoute']);
app.config(function ($routeProvider, $httpProvider) {
    $routeProvider.when('/', {
        templateUrl: 'summary.html',
        controller: 'summary',
        controllerAs: 'controller'
    }).when('/spider', {
        templateUrl: 'spider.html',
        controller: 'spider',
        controllerAs: 'controller'
    }).otherwise('/');
    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

});
app.controller('summary', function ($http,$scope) {
    var self = this;
    $http.get('/server/myServers').then(function (response) {
        $scope.servers = response.data.data.servers;
    });
});
app.controller('spider', function ($http) {
    var self = this;
    console.log(self);
});