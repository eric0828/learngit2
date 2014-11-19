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
//			����CERP����״̬�ӿ�
			IDataReceiptStub stub1=new IDataReceiptStub();
			IDataReceiptStub.SendErpInfStatus inuser1=new IDataReceiptStub.SendErpInfStatus();
			inuser1.setString(readTxtFile("E:\\IDE\\log\\2014-11-13\\send\\test.xml"));
			System.out.println(stub1.sendErpInfStatus(inuser1).get_return());
			//��oms
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
     * ���ܣ�Java��ȡtxt�ļ�������
     * ���裺1���Ȼ���ļ����
     * 2������ļ��������������һ���ֽ���������Ҫ��������������ж�ȡ
     * 3����ȡ������������Ҫ��ȡ�����ֽ���
     * 4��һ��һ�е������readline()��
     * ��ע����Ҫ���ǵ����쳣���
     * @param filePath
     */
    public static String readTxtFile(String filePath){
    	StringBuffer txtContent = new StringBuffer();
        try {
                String encoding="GBK";
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//���ǵ������ʽ
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = null;
                    while((lineTxt = bufferedReader.readLine()) != null){
                        System.out.println(lineTxt);
                        txtContent.append(lineTxt);
                    }
                    read.close();
        }else{
            System.out.println("�Ҳ���ָ�����ļ�");
            return null;
        }
        } catch (Exception e) {
            System.out.println("��ȡ�ļ����ݳ���");
            e.printStackTrace();
            return null;
        }
        return txtContent.toString();
     
    }
}
