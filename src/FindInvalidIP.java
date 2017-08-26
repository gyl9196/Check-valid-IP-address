import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindInvalidIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object to check IP
		IPValidationRegex checkIp = new IPValidationRegex();
		String fileName = "src/IPAddressList.txt";
		System.out.println(fileName);
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try{
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
			String lineContent;
			while((lineContent = bufferedReader.readLine()) != null) {
				//Export the file Content by line
				if(!checkIp.checkIP(lineContent)) {
					System.out.println(lineContent + " is not a valid IP address ");
				}
			}
		}catch (Exception e) {
			 e.printStackTrace();
		}finally{
			try {
				if (bufferedReader != null)
					bufferedReader.close();

				if (fileReader != null)
					fileReader.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
		
	}

}
