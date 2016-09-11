var App = angular.module('sampleApp', ['datatables', 'datatables.bootstrap']);

App.controller('MyController', ['$scope', 'DTOptionsBuilder', 'DTColumnBuilder',
    function ($scope, DTOptionsBuilder, DTColumnBuilder) {

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
                    return formatDataBeforeSentToBackend(data);
                },
                url: 'rest/json/dataPage',
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
            .withOption('bFilter', false) //remove search box upper right hand side
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
            });

        $scope.dtColumns = [
            DTColumnBuilder.newColumn('id').withTitle('User Id'),
            DTColumnBuilder.newColumn('firstName').withTitle('First Name'),
            DTColumnBuilder.newColumn('lastName').withTitle('Last Name'),
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
            console.log('create Row');
            if (data.id % 3 === 1) {
                $(row).css('background-color', 'yellow');
            }
        }
    }]);