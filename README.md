# RestServices-with-Angular-DataTables-Server-Side-Pagination-And-Sorting

Angular version version 1.3.1 ( [1.5.8](https://code.angularjs.org/1.5.8/angular.min.js) also working fine)
JQuery DataTables version 1.10.12

###Reference 
https://l-lin.github.io/angular-datatables/#/serverSideProcessing
http://www.dotnetawesome.com/2016/01/datatables-server-side-paging-sorting-filtering-angularjs.html
http://stackoverflow.com/questions/33475840/angularjs-datatable-server-side-pagination
https://datatables.net/examples/api/multi_filter.html
https://datatables.net/forums/discussion/22532/filter-column-into-server-side-process
https://github.com/l-lin/angular-datatables/issues/36

###Run locally
1). Run --> Edit Configuration --> Add New Configuration --> Tomcat server --> local.
2). Give a Name then select Application Server as tomcat in server tab.(you can select port and other configuration in the window).
3). Go to Deployment tab in the window click on + icon left.
4). Add Artifact as exploded.
5). Apply --> Ok and Run.
Type on browser localhost:<port> (http://localhost:8080)


###Json Document provided by the DataTable Api and we can get data to process backend.
https://datatables.net/manual/server-side
<pre class="javascript" style="font-family:monospace;"><span style="color: #009900;">&#123;</span>
  <span style="color: #3366CC;">&quot;draw&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">2</span><span style="color: #339933;">,</span>
  <span style="color: #3366CC;">&quot;columns&quot;</span><span style="color: #339933;">:</span> <span style="color: #009900;">&#91;</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;data&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;id&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;name&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;searchable&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">true</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;orderable&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">true</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;search&quot;</span><span style="color: #339933;">:</span> <span style="color: #009900;">&#123;</span>
        <span style="color: #3366CC;">&quot;value&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;&quot;</span><span style="color: #339933;">,</span>
        <span style="color: #3366CC;">&quot;regex&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">false</span>
      <span style="color: #009900;">&#125;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;data&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;firstName&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;name&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;searchable&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">true</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;orderable&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">true</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;search&quot;</span><span style="color: #339933;">:</span> <span style="color: #009900;">&#123;</span>
        <span style="color: #3366CC;">&quot;value&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;&quot;</span><span style="color: #339933;">,</span>
        <span style="color: #3366CC;">&quot;regex&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">false</span>
      <span style="color: #009900;">&#125;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;data&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;lastName&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;name&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;searchable&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">true</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;orderable&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">true</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;search&quot;</span><span style="color: #339933;">:</span> <span style="color: #009900;">&#123;</span>
        <span style="color: #3366CC;">&quot;value&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;&quot;</span><span style="color: #339933;">,</span>
        <span style="color: #3366CC;">&quot;regex&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">false</span>
      <span style="color: #009900;">&#125;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;data&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">null</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;name&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;searchable&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">true</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;orderable&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">false</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;search&quot;</span><span style="color: #339933;">:</span> <span style="color: #009900;">&#123;</span>
        <span style="color: #3366CC;">&quot;value&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;&quot;</span><span style="color: #339933;">,</span>
        <span style="color: #3366CC;">&quot;regex&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">false</span>
      <span style="color: #009900;">&#125;</span>
    <span style="color: #009900;">&#125;</span>
  <span style="color: #009900;">&#93;</span><span style="color: #339933;">,</span>
  <span style="color: #3366CC;">&quot;order&quot;</span><span style="color: #339933;">:</span> <span style="color: #009900;">&#91;</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;column&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">0</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;dir&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;desc&quot;</span>
    <span style="color: #009900;">&#125;</span>
  <span style="color: #009900;">&#93;</span><span style="color: #339933;">,</span>
  <span style="color: #3366CC;">&quot;start&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">0</span><span style="color: #339933;">,</span>
  <span style="color: #3366CC;">&quot;length&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">10</span><span style="color: #339933;">,</span>
  <span style="color: #3366CC;">&quot;search&quot;</span><span style="color: #339933;">:</span> <span style="color: #009900;">&#123;</span>
    <span style="color: #3366CC;">&quot;value&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;&quot;</span><span style="color: #339933;">,</span>
    <span style="color: #3366CC;">&quot;regex&quot;</span><span style="color: #339933;">:</span> <span style="color: #003366; font-weight: bold;">false</span>
  <span style="color: #009900;">&#125;</span>
<span style="color: #009900;">&#125;</span></pre>


###Format data before send to backend
<pre class="cpp" style="font-family:monospace;">var formatDataBeforeSentToBackend <span style="color: #000080;">=</span> function <span
        style="color: #008000;">&#40;</span>json<span style="color: #008000;">&#41;</span> <span
        style="color: #008000;">&#123;</span>
	var request <span style="color: #000080;">=</span> <span style="color: #008000;">&#123;</span>
		draw<span style="color: #008080;">:</span> json.<span style="color: #007788;">draw</span>,
		searchRegex<span style="color: #008080;">:</span> json.<span style="color: #007788;">search</span>.<span
            style="color: #007788;">regex</span>,
		searchValue<span style="color: #008080;">:</span> json.<span style="color: #007788;">search</span>.<span
            style="color: #007788;">value</span>,
		orderColumn<span style="color: #008080;">:</span> json.<span style="color: #007788;">order</span><span
            style="color: #008000;">&#91;</span><span style="color: #0000dd;">0</span><span style="color: #008000;">&#93;</span>.<span
            style="color: #007788;">column</span>,
		orderDir<span style="color: #008080;">:</span> json.<span style="color: #007788;">order</span><span
            style="color: #008000;">&#91;</span><span style="color: #0000dd;">0</span><span style="color: #008000;">&#93;</span>.<span
            style="color: #007788;">dir</span>,
		pageSize<span style="color: #008080;">:</span> json.<span style="color: #007788;">length</span>,
		start<span style="color: #008080;">:</span> json.<span style="color: #007788;">start</span>
	<span style="color: #008000;">&#125;</span><span style="color: #008080;">;</span>
&nbsp;
	<span style="color: #0000ff;">return</span> JSON.<span style="color: #007788;">stringify</span><span
            style="color: #008000;">&#40;</span>request<span style="color: #008000;">&#41;</span><span
            style="color: #008080;">;</span>
<span style="color: #008000;">&#125;</span><span style="color: #008080;">;</span></pre>

<pre class="javascript" style="font-family:monospace;">.<span style="color: #660066;">withOption</span><span
        style="color: #009900;">&#40;</span><span style="color: #3366CC;">'ajax'</span><span
        style="color: #339933;">,</span> <span style="color: #009900;">&#123;</span>
	dataSrc<span style="color: #339933;">:</span> <span style="color: #000066; font-weight: bold;">function</span> <span
            style="color: #009900;">&#40;</span>json<span style="color: #009900;">&#41;</span> <span
            style="color: #009900;">&#123;</span>
		<span style="color: #000066; font-weight: bold;">return</span> json.<span
            style="color: #660066;">data</span><span style="color: #339933;">;</span>
	<span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
	data<span style="color: #339933;">:</span> <span style="color: #000066; font-weight: bold;">function</span> <span
            style="color: #009900;">&#40;</span>data<span style="color: #009900;">&#41;</span> <span
            style="color: #009900;">&#123;</span>
		<span style="color: #000066; font-weight: bold;">return</span> formatDataBeforeSentToBackend<span
            style="color: #009900;">&#40;</span>data<span style="color: #009900;">&#41;</span><span
            style="color: #339933;">;</span>
	<span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
	url<span style="color: #339933;">:</span> <span style="color: #3366CC;">'rest/json/dataPage'</span><span
            style="color: #339933;">,</span>
	type<span style="color: #339933;">:</span> <span style="color: #3366CC;">'POST'</span><span style="color: #339933;">,</span>
	contentType<span style="color: #339933;">:</span> <span style="color: #3366CC;">'application/json'</span>
<span style="color: #009900;">&#125;</span><span style="color: #009900;">&#41;</span></pre>

###We should provide a json like this format below
<pre class="javascript" style="font-family:monospace;"><span style="color: #009900;">&#123;</span>
  <span style="color: #3366CC;">&quot;data&quot;</span><span style="color: #339933;">:</span> <span style="color: #009900;">&#91;</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;id&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">1</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;firstName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user first 1&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;lastName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user last 1&quot;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;id&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">2</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;firstName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user first 2&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;lastName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user last 2&quot;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;id&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">3</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;firstName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user first 3&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;lastName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user last 3&quot;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;id&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">4</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;firstName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user first 4&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;lastName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user last 4&quot;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;id&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">5</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;firstName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user first 5&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;lastName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user last 5&quot;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;id&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">6</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;firstName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user first 6&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;lastName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user last 6&quot;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;id&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">7</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;firstName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user first 7&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;lastName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user last 7&quot;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;id&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">8</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;firstName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user first 8&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;lastName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user last 8&quot;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;id&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">9</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;firstName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user first 9&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;lastName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user last 9&quot;</span>
    <span style="color: #009900;">&#125;</span><span style="color: #339933;">,</span>
    <span style="color: #009900;">&#123;</span>
      <span style="color: #3366CC;">&quot;id&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">10</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;firstName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user first 10&quot;</span><span style="color: #339933;">,</span>
      <span style="color: #3366CC;">&quot;lastName&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;user last 10&quot;</span>
    <span style="color: #009900;">&#125;</span>
  <span style="color: #009900;">&#93;</span><span style="color: #339933;">,</span>
  <span style="color: #3366CC;">&quot;draw&quot;</span><span style="color: #339933;">:</span> <span style="color: #3366CC;">&quot;2&quot;</span><span style="color: #339933;">,</span>
  <span style="color: #3366CC;">&quot;recordsFiltered&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">208</span><span style="color: #339933;">,</span>
  <span style="color: #3366CC;">&quot;recordsTotal&quot;</span><span style="color: #339933;">:</span> <span style="color: #CC0000;">208</span>
<span style="color: #009900;">&#125;</span></pre>

The important thing is DataTable provided "draw" and our response "draw" should be same.

[feature hide and show](http://legacy.datatables.net/usage/features#bFilter)
use as follows
<pre class="javascript" style="font-family:monospace;">.<span style="color: #660066;">withOption</span><span
        style="color: #009900;">&#40;</span><span style="color: #3366CC;">'bInfo'</span><span
        style="color: #339933;">,</span> <span style="color: #003366; font-weight: bold;">false</span><span
        style="color: #009900;">&#41;</span></pre>        


http://l-lin.github.io/angular-datatables/#/dataReloadWithAjax
http://stackoverflow.com/questions/34940835/angular-datatable-search-filter-on-search-press
https://datatables.net/reference/api/column%28%29.search%28%29
http://plnkr.co/edit/afMNeuUbwolGPffTdson?p=preview
http://l-lin.github.io/angular-datatables/#/dataReloadWithAjax


#Modify to do client side search. 
####when doing client side search we can use below code.
<pre style='color:#000020;background:#f6f8ff;'>$scope<span style='color:#308080; '>.</span>dtOptions <span style='color:#308080; '>=</span> DTOptionsBuilder
   <span style='color:#308080; '>.</span>fromSource<span style='color:#308080; '>(</span><span style='color:#800000; '>'</span><span style='color:#1060b6; '>rest/json/dataJson</span><span style='color:#800000; '>'</span><span style='color:#308080; '>)</span>
   <span style='color:#308080; '>.</span>withOption<span style='color:#308080; '>(</span><span style='color:#800000; '>'</span><span style='color:#1060b6; '>serverSide</span><span style='color:#800000; '>'</span><span style='color:#308080; '>,</span> <span style='color:#0f4d75; '>false</span><span style='color:#308080; '>)</span><span style='color:#406080; '>;</span>
</pre>

####important thing is to remove 
<pre style='color:#000020;background:#f6f8ff;'>.newOptions()
</pre>

####and remove bellow POST ajax call and use a GET service from server side as follows
<pre style='color:#000020;background:#f6f8ff;'>.withOption('ajax', <span style='color:#406080; '>{</span>
	dataSrc<span style='color:#308080; '>:</span> function <span style='color:#308080; '>(</span>json<span style='color:#308080; '>)</span> <span style='color:#406080; '>{</span>
		<span style='color:#200080; font-weight:bold; '>return</span> json<span style='color:#308080; '>.</span>data<span style='color:#406080; '>;</span>
	<span style='color:#406080; '>}</span><span style='color:#308080; '>,</span>
	data<span style='color:#308080; '>:</span> function <span style='color:#308080; '>(</span>data<span style='color:#308080; '>)</span> <span style='color:#406080; '>{</span>
		console<span style='color:#308080; '>.</span>log<span style='color:#308080; '>(</span><span style='color:#1060b6; '>"data: "</span><span style='color:#308080; '>+</span>JSON<span style='color:#308080; '>.</span>stringify<span style='color:#308080; '>(</span>data<span style='color:#308080; '>)</span><span style='color:#308080; '>)</span><span style='color:#406080; '>;</span>
		<span style='color:#200080; font-weight:bold; '>return</span> formatDataBeforeSentToBackend<span style='color:#308080; '>(</span>data<span style='color:#308080; '>)</span><span style='color:#406080; '>;</span>
	<span style='color:#406080; '>}</span><span style='color:#308080; '>,</span>
	url<span style='color:#308080; '>:</span> $scope<span style='color:#308080; '>.</span>API_URL<span style='color:#308080; '>,</span>
	type<span style='color:#308080; '>:</span> <span style='color:#1060b6; '>'POST'</span><span style='color:#308080; '>,</span>
	contentType<span style='color:#308080; '>:</span> <span style='color:#ffffff; background:#dd9999; font-weight:bold; font-style:italic; '>'application/json'</span>
<span style='color:#406080; '>}</span>)
</pre>


####Server side GET service
<pre style='color:#000020;background:#f6f8ff;'>@GET
@Path("/dataJson")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
<span style='color:#200080; font-weight:bold; '>public</span> List&lt;User> getPageForDataTable() <span style='color:#406080; '>{</span>
	<span style='color:#200080; font-weight:bold; '>return</span> controller<span style='color:#308080; '>.</span>getUsers<span style='color:#308080; '>(</span><span style='color:#308080; '>)</span><span style='color:#406080; '>;</span>
<span style='color:#406080; '>}</span>
</pre>