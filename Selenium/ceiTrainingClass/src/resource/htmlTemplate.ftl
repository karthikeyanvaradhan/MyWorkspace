<html>
<head>
  <title>${title}</title>
</head>
<body>
  <h2>${title}</h2>
  
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
</tr>
  
    <#list students as student>
      <tr>
    <td>${student.studName}</td>
    <td>${student.studID}</td> 
    <td>${student.studDesc}</td>
    <td>${student.markinLanguage}</td>
    <td>${student.markinEnglish}</td>
    <td>${student.markinCommerce}</td>
    <td>${student.markinEcnomics}</td>
    <td>${student.markinCompScience}</td>
    <td>Total : ${student.markinLanguage + student.markinEnglish}</td>
    
   
  </tr

    </#list>
  
</table>
</body>
</html>