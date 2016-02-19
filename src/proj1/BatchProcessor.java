package proj1;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class BatchProcessor {

	public void executeBatch(Batch batch) {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String filename = null;
			if (args.length > 0) {
				filename = args[0];
			} else {
				filename = "work/batch1.unix.xml";
			}
			System.out.println("Opening " + filename);
			File f = new File(filename);
			
			BatchParser bp = new BatchParser();
			bp.buildBatch(f);

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
