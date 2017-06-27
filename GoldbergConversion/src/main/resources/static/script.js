var app = angular.module("app", []);
app.controller("ConversionController", function($scope, $http) {  	
 	
 	$scope.convert = function() {		  
 		
 		$scope.convertedValue = "--" ;

        $http({
    		method : 'GET',
    		url : 'http://localhost:8010/convert?conversionType=' + $scope.conv 
    		+ '&input=' + $scope.input_value
			}).then(function(response) {   	
    		
    			$scope.convertedValue = response.data;
		
		});
            
    }
 
});