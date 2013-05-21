package cn.haohaowo.action.upload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	private static final long serialVersionUID = 1407962764619700507L;

	
	private File file;
	private String fileFileName;
	private String fileContentType;
	private String uploadDir;
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}

	@Override
	public String execute() throws Exception {
		
		String newFileName = null;
		long time = Calendar.getInstance().getTimeInMillis();
		String path = ServletActionContext.getServletContext().getRealPath("upload");
		File dir = new File(path);
		
		if(!dir.exists()){
			dir.mkdir();
		}
		
		int index = fileFileName.lastIndexOf(".");
		if(-1 != index){
			newFileName = time + fileFileName.substring(index);
		}
		else{
			newFileName = Long.toString(time);
		}
		
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		
		
		try{
			FileInputStream fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(new File(dir,newFileName));
			bos = new BufferedOutputStream(fos);
			
			int length = 0;
			byte[] b = new byte[1024*1024];
			while((length = bis.read(b))!= -1){
				bos.write(b,0,length);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(null != bos) bos.close();
			if(null != bis) bis.close();
		}
		
		return SUCCESS;
	}
}
