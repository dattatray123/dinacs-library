<%@include file="/jsp/init.jsp"%>


 <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<h1>List of books in our Library </h1>


<%
	List<Book> Book1 = Book1LocalServiceUtil.getBook(0, -1); 
%> 
<table border="1" width="80%"> <tr> 
<th>Book Title</th>
 <th>Author</th> 
 
  </tr> 
  <% 
  		for (Book book :book ) 
  		{ 
 		 	%> 
 			 	<tr> 
  					<td><%= book.getBookTitle() %>  </td> 
  					<td><%= book.getauthor() %>  </td>
  
   				</tr>
  			<% 
  		} 
  %> 
  </table> <br/>
  <a href="<portlet:renderURL/>">&laquo; Go Back</a>

