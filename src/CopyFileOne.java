import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class CopyFileOne {
    static void copy(String srcPathStr, String desPathStr)
	{
        //获取源文件的名称
        String newFileName = srcPathStr.substring(srcPathStr.lastIndexOf("\\")+1); //目标文件地址
        System.out.println("源文件:"+newFileName);
        desPathStr = desPathStr + File.separator + newFileName; //源文件地址
        System.out.println("目标文件地址:"+desPathStr);
        try
		{
             FileInputStream fis = new FileInputStream(srcPathStr);//创建输入流对象
             FileOutputStream fos = new FileOutputStream(desPathStr); //创建输出流对象               
             byte datas[] = new byte[1024*8];
             int len = 0; 
             while((len = fis.read(datas))!=-1)
			{
				fos.write(datas,0,len);
            } 
                fis.close();//释放资源
                fis.close();
        }
			catch (Exception e)
			{
                e.printStackTrace();
            }
    }
    public static void main(String[] args)
	{     
        String srcPathStr = "D:\\yxl\\asd.txt"; //源文件地址
		String desPathStr = "D:\\yxl\\abc"; //目标文件地址
        copy(srcPathStr, desPathStr);//文件拷贝
    } 
}