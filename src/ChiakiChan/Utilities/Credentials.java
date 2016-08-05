package ChiakiChan.Utilities;

/**
 * Created by Randy on 7/21/2016.
 */
public class Credentials {
    public static boolean isOwner(String id) {
        boolean ownerID;
        ownerID = id.equals("123978673677271042");
        return ownerID;
    }
    public static boolean isTyler(String id) {
        boolean ownerID;
        ownerID = id.equals("118829164437438464");
        return ownerID;
    }
    public static String token = "MjA1ODc1Mjk2NTY0NDEyNDE2.CnMXzw.KgctOa1eFvDkgCrcJcm_aPEGboY";
    public static String botID = "205875296564412416";
}