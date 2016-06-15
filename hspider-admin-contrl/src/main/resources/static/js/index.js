var app = angular.module('admin', ['ngRoute']);
app.config(function ($routeProvider, $httpProvider) {

    $routeProvider.when('/', {
        templateUrl: 'summary.html',
        controller: 'summary',
        controllerAs: 'controller'
    }).when('/login', {
        templateUrl: 'login.html',
        controller: 'navigation',
        controllerAs: 'controller'
    }).otherwise('/');

    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

});
app.controller('summary', function ($http) {
    var self = this;
    console.log('hone');
});
app.controller('navigation', function ($http) {
    var self = this;
    console.log('nav');
});