/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.resource;

import javax.swing.JOptionPane;

/**
 *
 * @author NghiaDTSE05330
 */
public class Constant {

    public static final String application_name = "Pascal N-Android";
    public static final String nullString = "";
    public static final String untitle = "untitle";

    //Connection
    public static final String cantconnect = "Can't connect to android device!\n";
    public static final String cantsenddata = "\"Connected! But can't not send file to android device\\nPlease refresh and try again!\"";

    public static final String con_host = "localhost";
    public static final String con_port = "6699";

    //Command 
    public static final String cmd_exec = "[EXECUTE]";
    public static final String cmd_debug = "[DEBUG]";
    //Dialog code 
    public static final String dlgResSaveFileSuccess = "File saved successfully!";

    //Save File Chooser
    public static final String sfc_title = "Save file as";
    public static final String sfc_FileFilterDescrition = "Pascal source code File";
    public static final String sfc_approvebtntext = "Save";
    public static final String sfc_fileextension = "pas";
    //Open File Chooser
    public static final String ofc_title = "Open file";
    public static final String ofc_FileFilterDescrition = "Pascal source code File";
    public static final String ofc_approvebtntext = "Open";
    public static final String ofc_fileextension = "pas";

    //MenuBar
    //File Menu
    //String
    public static final String filemenu_name = "File";
    public static final String filemenu_newFile = "New File";
    public static final String filemenu_openFile = "Open File";
    public static final String filemenu_saveFile = "Save";
    public static final String filemenu_saveFileAs = "Save as";
    public static final String filemenu_exit = "Exit";

    //Icon URL
    public static final String filemenu_icNewFile = "resource/Icon/icNewFile.png";
    public static final String filemenu_icOpenFile = "resource/Icon/icOpenFile.png";
    public static final String filemenu_icSaveFile = "resource/Icon/icSaveFile.png";
    public static final String filemenu_icSaveFileAs = "resource/Icon/icSaveFileAs.png";
    public static final String filemenu_icExit = "resource/Icon/icExit.png";
    //EditMenu
    //String
    public static final String editemenu_name = "Edit";
    public static final String editmenu_copy = "Copy";
    public static final String editmmenu_cut = "Cut";
    public static final String editmmenu_paste = "Open File";
    public static final String editmmenu_redo = "Redo";
    public static final String editmmenu_undo = "Undo";
    public static final String editMenu_selectAll = "Select All";

    //Icon URL
    public static final String editmenu_icCopy = "resource/Icon/icEditCopy.png";
    public static final String editmenu_icCut = "resource/Icon/icEditCut.png";
    public static final String editmenu_icPaste = "resource/Icon/icEditPaste.png";
    public static final String editmenu_icActiveRedo = Constant.toolbar_icActiveRedo;
    public static final String editmenu_icDeactiveRedo = Constant.toolbar_icDeactiveRedo;

    public static final String editmenu_icActiveUndo = Constant.toolbar_icActiveUndo;
    public static final String editmenu_icDeactiveUndo = Constant.toolbar_icDeactiveUndo;

    public static final String editmenu_icSelectAll = "resource/Icon/icEditSelectAll.png";
    //ToolBar
    //Icon URL
    public static final String toolbar_icNewFile = "resource/Icon/tbic_NewFile.png";
    public static final String toolbar_icOpenFile = "resource/Icon/tbic_OpenFile.png";
    public static final String toolbar_icSaveFile = "resource/Icon/tbic_SaveFile.png";
    public static final String toolbar_icActiveRedo = "resource/Icon/tbRedo.png";
    public static final String toolbar_icDeactiveRedo = "resource/Icon/tbDisabledRedo.png";
    public static final String toolbar_icActiveUndo = "resource/Icon/tbUndo.png";
    public static final String toolbar_icDeactiveUndo = "resource/Icon/tbDisabledUndo.png";
    public static final String toolbar_icRefresh = "resource/Icon/tbicRefresh.png";
    public static final String toolbar_icRunFile = "resource/Icon/tbicRunFile.png";

    //Alert Dialog
    public static final String alertdlg_savefile_text = "Would You Like to Save your Previous File First?";
    public static final String alertdlg_savefile_title = "Warning";

}
