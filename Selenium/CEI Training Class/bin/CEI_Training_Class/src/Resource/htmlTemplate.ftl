<html>
<body>
<h2>Marksheet of Students</h2>

<style>
table, th, td {
  border: 1px solid black;
}
</style>
<table style="width:100%">
<tr>
<th>NAME</th>
<th>ID</th>
<th>DESCRIPTION</th>
<th>LANGUAGE</th>
<th>ENGLISH</th>
<th>COMMERCE</th>
<th>ECNOMICS</th>
<th>COMPUTER SCIENCE</th>
<th>TOTAL</th>
<tr>
    <td>${name}</td>
    <td>${id}</td> 
    <td>${description}</td>
    <td>${language}</td>
    <td>${english}</td>
    <td>${commerce}</td>
    <td>${ecnomics}</td>
    <td>${computer science}</td>
    <td>$($language+$english+$commerce+$ecnomics+$computer science)</td>
  </tr>
</tr>
</table>
</body>
</html>
http://10.53.240.16:9082/set-aside-web/mockLogin.jsf
