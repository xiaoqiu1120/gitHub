package application;

import javafx.beans.property.SimpleStringProperty;

public  class  UserInfo {
	 private final SimpleStringProperty IPAddress;
     private final SimpleStringProperty loginNum;
     private final SimpleStringProperty password;
     private final SimpleStringProperty mac;
     private final SimpleStringProperty diskID;
     private final SimpleStringProperty messageDate;
     private final SimpleStringProperty isDownload;


/**
 * 
 * @param IPAddress
 * @param loginNum
 * @param password
 * @param mac
 * @param diskID
 * @param messageDate
 * @param isDownload
 */
     UserInfo(String IPAddress, String loginNum, String password,String mac,String diskID,String messageDate,String isDownload) {
         this.IPAddress = new SimpleStringProperty(IPAddress);
         this.loginNum = new SimpleStringProperty(loginNum);
         this.password = new SimpleStringProperty(password);
         this.mac = new SimpleStringProperty(mac);
         this.diskID = new SimpleStringProperty(diskID);
         this.messageDate = new SimpleStringProperty(messageDate);
         this.isDownload = new SimpleStringProperty(isDownload);
         
     }


     public String getIPAddress() {
         return IPAddress.get();
     }

     public void setIPAddress(String fName) {
    	 IPAddress.set(fName);
     }

     public String getLoginNum() {
         return loginNum.get();
     }

     public void setLoginNum(String fName) {
    	 loginNum.set(fName);
     }

     public String getMac() {
         return mac.get();
     }

     public void setMac(String fName) {
    	 mac.set(fName);
     }
     
     public String getDiskID() {
         return diskID.get();
     }

     public void setDiskID(String fName) {
    	 diskID.set(fName);
     }
     public String getMessageDate() {
         return messageDate.get();
     }

     public void setMessageDate(String fName) {
    	 messageDate.set(fName);
     }
     public String getPassword() {
         return password.get();
     }

     public void setPassword(String fName) {
    	 password.set(fName);
     }
     public String getIsDownload() {
         return isDownload.get();
     }

     public void setIsDownload(String fName) {
    	 isDownload.set(fName);
     }
     
     
 }



