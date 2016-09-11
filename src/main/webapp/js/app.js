var App = angular.module('sampleApp', ['datatables', 'datatables.bootstrap']);

App.controller('MyController', ['$scope', '$compile', 'DTOptionsBuilder', 'DTColumnBuilder',
    function ($scope, $compile, DTOptionsBuilder, DTColumnBuilder) {

        $scope.dtInstance = {};
        $scope.API_URL = 'rest/json/dataPage';

        var formatDataBeforeSentToBackend = function (json) {
            var request = {
                draw: json.draw,
                searchRegex: json.search.regex,
                searchValue: json.search.value,
                orderColumn: json.order[0].column,
                orderDir: json.order[0].dir,
                pageSize: json.length,
                start: json.start
            };

            return JSON.stringify(request);
        };

        $scope.dtOptions = DTOptionsBuilder.newOptions()
            .withOption('ajax', {
                dataSrc: function (json) {
                    return json.data;
                },
                data: function (data) {
                    console.log("data: "+JSON.stringify(data));
                    return formatDataBeforeSentToBackend(data);
                },
                url: $scope.API_URL,
                type: 'POST',
                contentType: 'application/json'
            })
            .withOption('createdRow', createdRow)
            .withOption('processing', true)
            .withOption('serverSide', true)
            .withPaginationType('full_numbers') // for get full pagination options // first / last / prev / next and page numbers
            .withDisplayLength(10) //set default page size
            .withOption('aaSorting', [0, 'asc']) //set default sorting order
            .withOption('bInfo', false) //remove bottom left information about pages
            .withOption('bLengthChange', false) //remove top left corner drop page size down
            //.withOption('bFilter', false) //remove search box upper right hand side
            .withBootstrap() //use bootstrap features
            .withBootstrapOptions({
                TableTools: {
                    classes: {
                        container: 'btn-group',
                        buttons: {
                            normal: 'btn btn-danger'
                        }
                    }
                },
                ColVis: {
                    classes: {
                        masterButton: 'btn btn-primary'
                    }
                },
                pagination: {
                    classes: {
                        ul: 'pagination pagination-sm center'
                    }
                }
            })
            .withOption('initComplete', function() {
                $('.dataTables_filter input').unbind();
                $('#searchData').on('click', function() {
                    $scope.dtInstance.DataTable
                        .column(0).search($('#search-id').val())
                        .column(1).search($('#search-fname').val())
                        .column(2).search($('#search-lname').val()).draw();
                })
            });

        $scope.dtColumns = [
            DTColumnBuilder.newColumn('id').withTitle('User Id').withOption('searchable', true),
            DTColumnBuilder.newColumn('firstName').withTitle('First Name').withOption('searchable', true),
            DTColumnBuilder.newColumn('lastName').withTitle('Last Name').withOption('searchable', true),
            DTColumnBuilder.newColumn(null).withTitle('Status').notSortable()
                .renderWith(actionsHtml)
        ];

        function actionsHtml(data, type, full, meta) {
            return '<select>' +
                '<option>Disabled</option>' +
                '<option>Live</option>' +
                '<option>Testing</option>' +
                '</select>';
        }

        function createdRow(row, data, dataIndex) {
            $compile(angular.element(row).contents())($scope);
            console.log('create Row');
            if (data.id % 3 === 1) {
                $(row).css('background-color', 'yellow');
            }
        }

        /*$scope.dataSearch = function () {
         console.log("data search function");
         var qrystrng = '?';
         $('#searchForm input').each(function () {
         qrystrng += $(this).attr('name') + '=' + $(this).val() + '&';
         });
         $('#searchForm select').each(function () {
         qrystrng += $(this).attr('name') + '=' + $(this).val() + '&';
         });
         qrystrng = qrystrng.slice(0, -1);
         var link = $scope.API_URL + 'tags' + qrystrng;
         /!*$scope.dtInstance.changeData(function (instance) {
         instance.columns[0].search.value = "Hasith"
         instance.columns[1].search.value = "wijerathna"
         return instance;
         });*!/

         $scope.dtColumns.every(function(i) {
         console.log("instance: "+i);
         });


         /!*$scope.dtInstance.reloadData(function (reloadData) {
         console.log("$scope.dtInstance.reloadData")
         }, false)*!/
         }*/

        $scope.clearSearch = function () {
            console.log("data clear function");
            $('#searchForm input').each(function () {
                $(this).val('');
            });
        }
    }]);
