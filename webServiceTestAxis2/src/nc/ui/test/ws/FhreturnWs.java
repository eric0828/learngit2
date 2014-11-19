package nc.ui.test.ws;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import oms.omsjcdwzl.OmsJcdwzlStub;
import oms.omsjcdwzl.OmsJcdwzlStub.SendJcdwzlResponse;
import oms.omsjcdwzl.OmsJcdwzlStub.SendJcdwzlResponseE;

import nc.pubitf.tjufitf.basicitf.pub.idatareceipt.IDataReceiptStub;


public class FhreturnWs {
	public static void main(String[] args) {
		try {
//			调用CERP接受状态接口
			IDataReceiptStub stub1=new IDataReceiptStub();
			IDataReceiptStub.SendErpInfStatus inuser1=new IDataReceiptStub.SendErpInfStatus();
			inuser1.setString(readTxtFile("E:\\IDE\\log\\2014-11-13\\send\\test.xml"));
			System.out.println(stub1.sendErpInfStatus(inuser1).get_return());
			//调oms
//			OmsJcdwzlStub stub=new OmsJcdwzlStub();
//			OmsJcdwzlStub.SendJcdwzl inuser=new OmsJcdwzlStub.SendJcdwzl();
//			
//			inuser.setArg0(readTxtFile("E:\\IDE\\log\\2014-11-13\\send\\test.xml"));
////			inuser.setArg0("123");
//			
//			OmsJcdwzlStub.SendJcdwzlE inuserE=new OmsJcdwzlStub.SendJcdwzlE();
//			inuserE.setSendJcdwzl(inuser);
//			SendJcdwzlResponseE returnparam = stub.sendJcdwzl(inuserE);
//			SendJcdwzlResponse a=returnparam.getSendJcdwzlResponse();
//			System.out.println(a.getReturnArg());
//			
////			System.out.println(stub.);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
     * 功能：Java读取txt文件的内容
     * 步骤：1：先获得文件句柄
     * 2：获得文件句柄当做是输入一个字节码流，需要对这个输入流进行读取
     * 3：读取到输入流后，需要读取生成字节流
     * 4：一行一行的输出。readline()。
     * 备注：需要考虑的是异常情况
     * @param filePath
     */
    public static String readTxtFile(String filePath){
    	StringBuffer txtContent = new StringBuffer();
        try {
                String encoding="GBK";
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //判断文件是否存在
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//考虑到编码格式
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = null;
                    while((lineTxt = bufferedReader.readLine()) != null){
                        System.out.println(lineTxt);
                        txtContent.append(lineTxt);
                    }
                    read.close();
        }else{
            System.out.println("找不到指定的文件");
            return null;
        }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
            return null;
        }
        return txtContent.toString();
     
    }
}
