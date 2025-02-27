package progistar.scan.function;

import java.util.Hashtable;

import progistar.scan.data.Constants;

public class ENSTMapper {

	private static Hashtable<String, String> ENSTtoENSG = new Hashtable<String, String>();
	private static Hashtable<String, String> ENSTtoGENENAME = new Hashtable<String, String>();
	
	public static void putENST (String enstID, String ensgID, String geneName) {
		ENSTtoENSG.put(enstID, ensgID);
		ENSTtoGENENAME.put(enstID, geneName);
	}
	
	/**
	 * Get ENSG ID corresponding to ENST ID. <br>
	 * If not available, it returns "NA" string.
	 * 
	 * @param enstID
	 * @return
	 */
	public static String getENSGbyENST (String enstID) {
		String ensg = ENSTtoENSG.get(enstID);
		
		if(ensg == null) {
			ensg = Constants.ID_NULL;
		}
		
		return ensg;
	}
	
	/**
	 * Get gene name corresponding to ENST ID. <br>
	 * If not available, it returns "NA" string.
	 * 
	 * @param enstID
	 * @return
	 */
	public static String getGeneNamebyENST (String enstID) {
		String geneName = ENSTtoGENENAME.get(enstID);
		
		if(geneName == null) {
			geneName = Constants.ID_NULL;
		}
		
		return geneName;
	}
}

