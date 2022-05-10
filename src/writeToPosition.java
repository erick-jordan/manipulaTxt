import java.io.IOException;
import java.io.RandomAccessFile;

public class writeToPosition {
	
	private void writeToPosition(String filename, int data, long position) 
			  throws IOException {
			    RandomAccessFile writer = new RandomAccessFile(filename, "rw");
			    writer.seek(position);
			    writer.writeInt(data);
			    writer.close();
			}

}
