import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class CopyFileOne {
    static void copy(String srcPathStr, String desPathStr)
	{
        //��ȡԴ�ļ�������
        String newFileName = srcPathStr.substring(srcPathStr.lastIndexOf("\\")+1); //Ŀ���ļ���ַ
        System.out.println("Դ�ļ�:"+newFileName);
        desPathStr = desPathStr + File.separator + newFileName; //Դ�ļ���ַ
        System.out.println("Ŀ���ļ���ַ:"+desPathStr);
        try
		{
             FileInputStream fis = new FileInputStream(srcPathStr);//��������������
             FileOutputStream fos = new FileOutputStream(desPathStr); //�������������               
             byte datas[] = new byte[1024*8];
             int len = 0; 
             while((len = fis.read(datas))!=-1)
			{
				fos.write(datas,0,len);
            } 
                fis.close();//�ͷ���Դ
                fis.close();
        }
			catch (Exception e)
			{
                e.printStackTrace();
            }
    }
    public static void main(String[] args)
	{     
        String srcPathStr = "D:\\yxl\\asd.txt"; //Դ�ļ���ַ
		String desPathStr = "D:\\yxl\\abc"; //Ŀ���ļ���ַ
        copy(srcPathStr, desPathStr);//�ļ�����
    } 
}