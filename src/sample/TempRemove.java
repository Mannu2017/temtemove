package sample;

import java.io.File;
import java.io.IOException;
import java.util.TimerTask;

import org.apache.commons.io.FileUtils;

public class TempRemove extends TimerTask {

	@Override
	public void run() {
		String tmppath=	System.getProperty("java.io.tmpdir");
		recursiveDelete(new File(tmppath));
	}

	private static void recursiveDelete(File file) {
		if (!file.exists())
            return;
		
		if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                recursiveDelete(f);
            }
            
            try {
				FileUtils.deleteDirectory(new File(file.getAbsolutePath()));
			} catch (IOException e) {
				e.printStackTrace();
			}
            System.out.println("Deleted file/folder: "+file.getAbsolutePath());
		}
	}
	
}
