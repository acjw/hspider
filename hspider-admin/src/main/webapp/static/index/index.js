var app = angular.module('admin', ['ngRoute']);
app.config(function ($routeProvider, $httpProvider) {

    $routeProvider.when('/', {
        templateUrl: 'home.html',
        controller: 'home',
        controllerAs: 'controller'
    }).when('/login', {
        templateUrl: 'login.html',
        controller: 'navigation',
        controllerAs: 'controller'
    }).otherwise('/');

    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

});
app.controller('home', function ($http) {
    var self = this;
    console.log('hone');
});
app.controller('navigation', function ($http) {
    var self = this;
    console.log('nav');
});