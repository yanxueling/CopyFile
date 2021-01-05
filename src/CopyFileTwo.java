import java.io.*;


public class CopyFileTwo {
	public static void copy(String fromAddress,String toAddress) throws Exception{
        //�����ļ�a��д������
        BufferedWriter bw = new BufferedWriter(new FileWriter(fromAddress));
        String str = "abcd\ngfdkgjk\nfhkjwe";
        bw.write(str);
        bw.close();

        //�������������
        InputStream in = new FileInputStream(new File(fromAddress));
        OutputStream out = new FileOutputStream(new File(toAddress));
        byte[] b = new byte[1024];
        int len;
        while ((len=in.read(b)) > 0){
            out.write(b,0,len);
        }
        in.close();
        out.close();

        //����̨��ӡ���ƺ��b�ļ�
        BufferedReader bw2 = new BufferedReader(new FileReader(toAddress));
        String str2;
        while((str2=bw2.readLine()) != null){
            System.out.println(str2);
        }
        bw2.close();
    }
	public static void main(String[] args) {
        
        String fadd = "D:\\yxl\\a.txt";
        String tadd = "D:\\yxl\\b.txt";
        try {
        	copy(fadd,tadd);
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
}
}
