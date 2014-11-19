
/**
 * Exception.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package nc.pubitf.tjufitf.basicitf.pub.idatareceipt;

public class Exception extends java.lang.Exception{

    private static final long serialVersionUID = 1415872640538L;
    
    private nc.pubitf.tjufitf.basicitf.pub.idatareceipt.IDataReceiptStub.ExceptionE faultMessage;

    
        public Exception() {
            super("Exception");
        }

        public Exception(java.lang.String s) {
           super(s);
        }

        public Exception(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public Exception(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(nc.pubitf.tjufitf.basicitf.pub.idatareceipt.IDataReceiptStub.ExceptionE msg){
       faultMessage = msg;
    }
    
    public nc.pubitf.tjufitf.basicitf.pub.idatareceipt.IDataReceiptStub.ExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    