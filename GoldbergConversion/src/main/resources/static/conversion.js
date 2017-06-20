angular.module('conversionsApp', []).controller('conversionController', function($scope) {
	var todoList = this;
    $scope.products = ["Milk", "Bread", "Cheese"];
    $scope.convert = function () {
		$scope.products.push($scope.addMe);
	}  
});

