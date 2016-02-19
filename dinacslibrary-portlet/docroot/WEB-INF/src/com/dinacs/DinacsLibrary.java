package com.dinacs;

import java.io.IOException; 

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class DinacsLibrary<LMSBook> extends MVCPortlet{
	public void updateBook(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws IOException, PortletException, SystemException
			{
				String bookTitle = ParamUtil.getString(actionRequest, "bookTitle");
				String author = ParamUtil.getString(actionRequest, "author");
				
				
				int bookId = ParamUtil.getInteger(actionRequest,"bookId");
				String bookType = ParamUtil.getString(actionRequest, "bookType");
				
				String termsAndCondition = ParamUtil.getString(actionRequest, "termsAndCondition");
				
				
				
				System.out.println("Your inputs ==> " + bookTitle + ", " + author + ","  + bookId + ", " + bookType+ "," + termsAndCondition);
			
				
				Book Book1 = new Book();
				long bookId1 = 0l;
				 try {
					 bookId1 = CounterLocalServiceUtil.increment();
				 } 
				catch (SystemException e)
				 {
				 e.printStackTrace();
				 } 
				

				Book1.setBookId((int) bookId1); 
				Book1.setBookTitle(bookTitle);
				Book1.setAuthor(author);
				

				
				Book1 = Book1LocalServiceUtil.addBook1(Book1);
				
				
			}

	
}
