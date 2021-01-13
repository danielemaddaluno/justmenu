package com.justmenu;

/**
 * Created by madx on 25/08/15.
 */
public abstract class OSValidator {
    static String OS = System.getProperty("os.name").toLowerCase();

    public static boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

    public static boolean isUnix() {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
    }

    public static boolean isSolaris() {
        return (OS.indexOf("sunos") >= 0);
    }
    
    public static void setDockIconBadge(String value){
//    	if(isMac())
//    		Application.getApplication().setDockIconBadge(value);
    }

	public static void setAppIcon() {
//		if (OSValidator.isMac()) {
//			Application.getApplication()
//					.setDockIconImage(AppFileIcon.CALENDAR_O.createImageIcon().getImage());
//		} else if (OSValidator.isWindows()) {
//			// setIconImage(AppFileIcon.CALENDAR_O.createImageIcon());
//		}
	}
}