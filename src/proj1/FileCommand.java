package proj1;

import org.w3c.dom.Element;

public class FileCommand extends Command {
	public void parse(Element elem) 
	{
		String id = elem.getAttribute("id");
		if (id == null || id.isEmpty()) {
			System.out.println("Missing ID in CMD Command");
//			throw new ProcessException("Missing ID in CMD Command");
		}
		System.out.println("ID: " + id);
		
		String path = elem.getAttribute("path");
		if (path == null || path.isEmpty()) {
			System.out.println("Missing PATH in CMD Command");
//			throw new ProcessException("Missing PATH in CMD Command");
		}
		System.out.println("Path: " + path);

		// Arguments must be passed to ProcessBuilder as a list of
		// individual strings. 
//		List<String> cmdArgs = new ArrayList<String>();
//		String arg = elem.getAttribute("args");
//		if (!(arg == null || arg.isEmpty())) {
//			StringTokenizer st = new StringTokenizer(arg);
//			while (st.hasMoreTokens()) {
//				String tok = st.nextToken();
//				
//				cmdArgs.add(tok);
//			}
//		}
//		for(String argi: cmdArgs) {
//			System.out.println("Arg " + argi);
//		}
//
//		String inID = elem.getAttribute("in");
//		if (!(inID == null || inID.isEmpty())) {
//			System.out.println("inID: " + inID);
//		}
//
//		String outID = elem.getAttribute("out");
//		if (!(outID == null || outID.isEmpty())) {
//			System.out.println("outID: " + outID);
//		}
//		return elem;
	}
}