package com.gw.searchPortal.Util;

import java.util.ArrayList;

import com.example.search.AccountContactInfo;

public class JSPUtil {
	
      public static String getContactID(ArrayList<AccountContactInfo> contactList, String contactName) {
    	  String contactID = "";
    	  for(AccountContactInfo contactInfo : contactList) {
    		 if(contactInfo.getAccountContactName() == contactName) {
    			contactID = contactInfo.getAccountContactPublicId(); 
                break;
    		 }
    	  }
    	   return contactID;
      }

}
