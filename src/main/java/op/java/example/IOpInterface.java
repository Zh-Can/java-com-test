
package op.java.example;

import com.sun.jna.platform.win32.Variant.VARIANT;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;

/**
 * <p>uuid({51E59A6F-85F4-4DA0-A01E-C9B6B3B8B8A7})</p>
 */
@ComInterface(iid="{51E59A6F-85F4-4DA0-A01E-C9B6B3B8B8A7}")
public interface IOpInterface extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "Ver", dispId = 0x1)
    String Ver();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     * @param path [in] {@code String}
     */
    @ComMethod(name = "SetPath", dispId = 0x2)
    Integer SetPath(String path);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "GetPath", dispId = 0x3)
    String GetPath();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "GetBasePath", dispId = 0x4)
    String GetBasePath();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "GetID", dispId = 0x5)
    Integer GetID();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "GetLastError", dispId = 0x6)
    Integer GetLastError();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     * @param show_type [in] {@code Integer}
     */
    @ComMethod(name = "SetShowErrorMsg", dispId = 0x7)
    Integer SetShowErrorMsg(Integer show_type);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     * @param millseconds [in] {@code Integer}
     */
    @ComMethod(name = "Sleep", dispId = 0x8)
    Integer Sleep(Integer millseconds);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
     * @param process_name [in] {@code String}
     * @param dll_name [] {@code String}
     * @param ret [] {@code Integer}
     */
    @ComMethod(name = "InjectDll", dispId = 0x9)
    void InjectDll(String process_name,
            String dll_name,
            Integer ret);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(16)</p>
     * @param enable [in] {@code Integer}
     */
    @ComMethod(name = "EnablePicCache", dispId = 0xa)
    Integer EnablePicCache(Integer enable);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(17)</p>
     * @param file_name [in] {@code String}
     */
    @ComMethod(name = "CapturePre", dispId = 0xb)
    Integer CapturePre(String file_name);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(18)</p>
     * @param mapWidth [in] {@code Integer}
     * @param mapHeight [in] {@code Integer}
     * @param disable_points [in] {@code String}
     * @param beginX [in] {@code Integer}
     * @param beginY [in] {@code Integer}
     * @param endX [in] {@code Integer}
     * @param endY [in] {@code Integer}
     */
    @ComMethod(name = "AStarFindPath", dispId = 0x14)
    String AStarFindPath(Integer mapWidth,
            Integer mapHeight,
            String disable_points,
            Integer beginX,
            Integer beginY,
            Integer endX,
            Integer endY);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(19)</p>
     * @param all_pos [in] {@code String}
     * @param type [in] {@code Integer}
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     */
    @ComMethod(name = "FindNearestPos", dispId = 0x15)
    String FindNearestPos(String all_pos,
            Integer type,
            Integer x,
            Integer y);
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(20)</p>
     * @param parent [in] {@code Integer}
     * @param title [in] {@code String}
     * @param class_name [in] {@code String}
     * @param filter [in] {@code Integer}
     */
    @ComMethod(name = "EnumWindow", dispId = 0x3a)
    String EnumWindow(Integer parent,
            String title,
            String class_name,
            Integer filter);
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(21)</p>
     * @param process_name [in] {@code String}
     * @param title [in] {@code String}
     * @param class_name [in] {@code String}
     * @param filter [in] {@code Integer}
     */
    @ComMethod(name = "EnumWindowByProcess", dispId = 0x3b)
    String EnumWindowByProcess(String process_name,
            String title,
            String class_name,
            Integer filter);
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(22)</p>
     * @param name [in] {@code String}
     */
    @ComMethod(name = "EnumProcess", dispId = 0x3c)
    String EnumProcess(String name);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(23)</p>
     * @param ClientToScreen [in] {@code Integer}
     * @param x [inout] {@code Object}
     * @param y [inout] {@code Object}
     */
    @ComMethod(name = "ClientToScreen", dispId = 0x3d)
    Integer ClientToScreen(Integer ClientToScreen,
            VARIANT x,
            VARIANT y);
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(24)</p>
     * @param class_name [in] {@code String}
     * @param title [in] {@code String}
     */
    @ComMethod(name = "FindWindow", dispId = 0x3e)
    Integer FindWindow(String class_name,
            String title);
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(25)</p>
     * @param process_name [in] {@code String}
     * @param class_name [in] {@code String}
     * @param title [in] {@code String}
     */
    @ComMethod(name = "FindWindowByProcess", dispId = 0x3f)
    Integer FindWindowByProcess(String process_name,
            String class_name,
            String title);
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(26)</p>
     * @param process_id [in] {@code Integer}
     * @param class_name [in] {@code String}
     * @param title [in] {@code String}
     */
    @ComMethod(name = "FindWindowByProcessId", dispId = 0x40)
    Integer FindWindowByProcessId(Integer process_id,
            String class_name,
            String title);
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(27)</p>
     * @param parent [in] {@code Integer}
     * @param class_name [in] {@code String}
     * @param title [in] {@code String}
     */
    @ComMethod(name = "FindWindowEx", dispId = 0x41)
    Integer FindWindowEx(Integer parent,
            String class_name,
            String title);
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(28)</p>
     * @param hwnd [in] {@code Integer}
     * @param x1 [out] {@code Object}
     * @param y1 [out] {@code Object}
     * @param x2 [out] {@code Object}
     * @param y2 [out] {@code Object}
     */
    @ComMethod(name = "GetClientRect", dispId = 0x42)
    Integer GetClientRect(Integer hwnd,
            VARIANT x1,
            VARIANT y1,
            VARIANT x2,
            VARIANT y2);
            
    /**
     * <p>id(0x43)</p>
     * <p>vtableId(29)</p>
     * @param hwnd [in] {@code Integer}
     * @param width [out] {@code Object}
     * @param height [out] {@code Object}
     */
    @ComMethod(name = "GetClientSize", dispId = 0x43)
    Integer GetClientSize(Integer hwnd,
            VARIANT width,
            VARIANT height);
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "GetForegroundFocus", dispId = 0x44)
    Integer GetForegroundFocus();
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "GetForegroundWindow", dispId = 0x45)
    Integer GetForegroundWindow();
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "GetMousePointWindow", dispId = 0x46)
    Integer GetMousePointWindow();
            
    /**
     * <p>id(0x47)</p>
     * <p>vtableId(33)</p>
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     */
    @ComMethod(name = "GetPointWindow", dispId = 0x47)
    Integer GetPointWindow(Integer x,
            Integer y);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(34)</p>
     * @param pid [in] {@code Integer}
     */
    @ComMethod(name = "GetProcessInfo", dispId = 0x48)
    String GetProcessInfo(Integer pid);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(35)</p>
     * @param flag [in] {@code Integer}
     */
    @ComMethod(name = "GetSpecialWindow", dispId = 0x49)
    Integer GetSpecialWindow(Integer flag);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(36)</p>
     * @param hwnd [in] {@code Integer}
     * @param flag [in] {@code Integer}
     */
    @ComMethod(name = "GetWindow", dispId = 0x4a)
    Integer GetWindow(Integer hwnd,
            Integer flag);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(37)</p>
     * @param hwnd [in] {@code Integer}
     */
    @ComMethod(name = "GetWindowClass", dispId = 0x4b)
    String GetWindowClass(Integer hwnd);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(38)</p>
     * @param hwnd [in] {@code Integer}
     */
    @ComMethod(name = "GetWindowProcessId", dispId = 0x4c)
    Integer GetWindowProcessId(Integer hwnd);
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(39)</p>
     * @param hwnd [in] {@code Integer}
     */
    @ComMethod(name = "GetWindowProcessPath", dispId = 0x4d)
    String GetWindowProcessPath(Integer hwnd);
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(40)</p>
     * @param hwnd [in] {@code Integer}
     * @param x1 [out] {@code Object}
     * @param y1 [out] {@code Object}
     * @param x2 [out] {@code Object}
     * @param y2 [out] {@code Object}
     */
    @ComMethod(name = "GetWindowRect", dispId = 0x4e)
    Integer GetWindowRect(Integer hwnd,
            VARIANT x1,
            VARIANT y1,
            VARIANT x2,
            VARIANT y2);
            
    /**
     * <p>id(0x4f)</p>
     * <p>vtableId(41)</p>
     * @param hwnd [in] {@code Integer}
     * @param flag [in] {@code Integer}
     */
    @ComMethod(name = "GetWindowState", dispId = 0x4f)
    Integer GetWindowState(Integer hwnd,
            Integer flag);
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(42)</p>
     * @param hwnd [in] {@code Integer}
     */
    @ComMethod(name = "GetWindowTitle", dispId = 0x50)
    String GetWindowTitle(Integer hwnd);
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(43)</p>
     * @param hwnd [in] {@code Integer}
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     */
    @ComMethod(name = "MoveWindow", dispId = 0x51)
    Integer MoveWindow(Integer hwnd,
            Integer x,
            Integer y);
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(44)</p>
     * @param hwnd [in] {@code Integer}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "ScreenToClient", dispId = 0x52)
    Integer ScreenToClient(Integer hwnd,
            VARIANT x,
            VARIANT y);
            
    /**
     * <p>id(0x53)</p>
     * <p>vtableId(45)</p>
     * @param hwnd [in] {@code Integer}
     */
    @ComMethod(name = "SendPaste", dispId = 0x53)
    Integer SendPaste(Integer hwnd);
            
    /**
     * <p>id(0x54)</p>
     * <p>vtableId(46)</p>
     * @param hwnd [in] {@code Integer}
     * @param width [in] {@code Integer}
     * @param hight [in] {@code Integer}
     */
    @ComMethod(name = "SetClientSize", dispId = 0x54)
    Integer SetClientSize(Integer hwnd,
            Integer width,
            Integer hight);
            
    /**
     * <p>id(0x55)</p>
     * <p>vtableId(47)</p>
     * @param hwnd [in] {@code Integer}
     * @param flag [in] {@code Integer}
     */
    @ComMethod(name = "SetWindowState", dispId = 0x55)
    Integer SetWindowState(Integer hwnd,
            Integer flag);
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(48)</p>
     * @param hwnd [in] {@code Integer}
     * @param width [in] {@code Integer}
     * @param height [in] {@code Integer}
     */
    @ComMethod(name = "SetWindowSize", dispId = 0x56)
    Integer SetWindowSize(Integer hwnd,
            Integer width,
            Integer height);
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(49)</p>
     * @param hwnd [in] {@code Integer}
     * @param title [in] {@code String}
     */
    @ComMethod(name = "SetWindowText", dispId = 0x57)
    Integer SetWindowText(Integer hwnd,
            String title);
            
    /**
     * <p>id(0x58)</p>
     * <p>vtableId(50)</p>
     * @param hwnd [in] {@code Integer}
     * @param trans [in] {@code Integer}
     */
    @ComMethod(name = "SetWindowTransparent", dispId = 0x58)
    Integer SetWindowTransparent(Integer hwnd,
            Integer trans);
            
    /**
     * <p>id(0x59)</p>
     * <p>vtableId(51)</p>
     * @param hwnd [in] {@code Integer}
     * @param str [in] {@code String}
     */
    @ComMethod(name = "SendString", dispId = 0x59)
    Integer SendString(Integer hwnd,
            String str);
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(52)</p>
     * @param hwnd [in] {@code Integer}
     * @param str [in] {@code String}
     */
    @ComMethod(name = "SendStringIme", dispId = 0x5a)
    Integer SendStringIme(Integer hwnd,
            String str);
            
    /**
     * <p>id(0x5b)</p>
     * <p>vtableId(53)</p>
     * @param cmdline [in] {@code String}
     * @param mode [in] {@code Integer}
     */
    @ComMethod(name = "RunApp", dispId = 0x5b)
    Integer RunApp(String cmdline,
            Integer mode);
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(54)</p>
     * @param cmdline [in] {@code String}
     * @param cmdshow [in] {@code Integer}
     */
    @ComMethod(name = "WinExec", dispId = 0x5f)
    Integer WinExec(String cmdline,
            Integer cmdshow);
            
    /**
     * <p>id(0x60)</p>
     * <p>vtableId(55)</p>
     * @param cmd [in] {@code String}
     * @param millseconds [in] {@code Integer}
     */
    @ComMethod(name = "GetCmdStr", dispId = 0x60)
    String GetCmdStr(String cmd,
            Integer millseconds);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(56)</p>
     * @param hwnd [in] {@code Integer}
     * @param display [in] {@code String}
     * @param mouse [in] {@code String}
     * @param keypad [in] {@code String}
     * @param mode [in] {@code Integer}
     */
    @ComMethod(name = "BindWindow", dispId = 0x64)
    Integer BindWindow(Integer hwnd,
            String display,
            String mouse,
            String keypad,
            Integer mode);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(57)</p>
     */
    @ComMethod(name = "UnBindWindow", dispId = 0x65)
    Integer UnBindWindow();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(58)</p>
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "GetCursorPos", dispId = 0x78)
    Integer GetCursorPos(VARIANT x,
            VARIANT y);
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(59)</p>
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     */
    @ComMethod(name = "MoveR", dispId = 0x79)
    Integer MoveR(Integer x,
            Integer y);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(60)</p>
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     */
    @ComMethod(name = "MoveTo", dispId = 0x7a)
    Integer MoveTo(Integer x,
            Integer y);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(61)</p>
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     * @param w [in] {@code Integer}
     * @param h [in] {@code Integer}
     */
    @ComMethod(name = "MoveToEx", dispId = 0x7b)
    Integer MoveToEx(Integer x,
            Integer y,
            Integer w,
            Integer h);
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(62)</p>
     */
    @ComMethod(name = "LeftClick", dispId = 0x7c)
    Integer LeftClick();
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "LeftDoubleClick", dispId = 0x7d)
    Integer LeftDoubleClick();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(64)</p>
     */
    @ComMethod(name = "LeftDown", dispId = 0x7e)
    Integer LeftDown();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(65)</p>
     */
    @ComMethod(name = "LeftUp", dispId = 0x7f)
    Integer LeftUp();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(66)</p>
     */
    @ComMethod(name = "MiddleClick", dispId = 0x80)
    Integer MiddleClick();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(67)</p>
     */
    @ComMethod(name = "MiddleDown", dispId = 0x81)
    Integer MiddleDown();
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(68)</p>
     */
    @ComMethod(name = "MiddleUp", dispId = 0x82)
    Integer MiddleUp();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(69)</p>
     */
    @ComMethod(name = "RightClick", dispId = 0x83)
    Integer RightClick();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(70)</p>
     */
    @ComMethod(name = "RightDown", dispId = 0x84)
    Integer RightDown();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(71)</p>
     */
    @ComMethod(name = "RightUp", dispId = 0x85)
    Integer RightUp();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(72)</p>
     */
    @ComMethod(name = "WheelDown", dispId = 0x86)
    Integer WheelDown();
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(73)</p>
     */
    @ComMethod(name = "WheelUp", dispId = 0x87)
    Integer WheelUp();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(74)</p>
     * @param vk_code [in] {@code Integer}
     */
    @ComMethod(name = "GetKeyState", dispId = 0x88)
    Integer GetKeyState(Integer vk_code);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(75)</p>
     * @param vk_code [in] {@code Integer}
     */
    @ComMethod(name = "KeyDown", dispId = 0x89)
    Integer KeyDown(Integer vk_code);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(76)</p>
     * @param vk_code [in] {@code String}
     */
    @ComMethod(name = "KeyDownChar", dispId = 0x8a)
    Integer KeyDownChar(String vk_code);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(77)</p>
     * @param vk_code [in] {@code Integer}
     */
    @ComMethod(name = "KeyUp", dispId = 0x8b)
    Integer KeyUp(Integer vk_code);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(78)</p>
     * @param vk_code [in] {@code String}
     */
    @ComMethod(name = "KeyUpChar", dispId = 0x8c)
    Integer KeyUpChar(String vk_code);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(79)</p>
     * @param vk_code [in] {@code Integer}
     * @param time_out [in] {@code Integer}
     */
    @ComMethod(name = "WaitKey", dispId = 0x8d)
    Integer WaitKey(Integer vk_code,
            Integer time_out);
            
    /**
     * <p>id(0x8e)</p>
     * <p>vtableId(80)</p>
     * @param vk_code [in] {@code Integer}
     */
    @ComMethod(name = "KeyPress", dispId = 0x8e)
    Integer KeyPress(Integer vk_code);
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(81)</p>
     * @param vk_code [in] {@code String}
     */
    @ComMethod(name = "KeyPressChar", dispId = 0x8f)
    Integer KeyPressChar(String vk_code);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(82)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param file_name [in] {@code String}
     */
    @ComMethod(name = "Capture", dispId = 0x96)
    Integer Capture(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String file_name);
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(83)</p>
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "CmpColor", dispId = 0x97)
    Integer CmpColor(Integer x,
            Integer y,
            String color,
            Double sim);
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(84)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code Integer}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "FindColor", dispId = 0x98)
    Integer FindColor(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String color,
            Double sim,
            Integer dir,
            VARIANT x,
            VARIANT y);
            
    /**
     * <p>id(0x99)</p>
     * <p>vtableId(85)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code Integer}
     */
    @ComMethod(name = "FindColorEx", dispId = 0x99)
    String FindColorEx(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String color,
            Double sim,
            Integer dir);
            
    /**
     * <p>id(0x9a)</p>
     * <p>vtableId(86)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param first_color [in] {@code String}
     * @param offset_color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code Integer}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "FindMultiColor", dispId = 0x9a)
    Integer FindMultiColor(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String first_color,
            String offset_color,
            Double sim,
            Integer dir,
            VARIANT x,
            VARIANT y);
            
    /**
     * <p>id(0x9b)</p>
     * <p>vtableId(87)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param first_color [in] {@code String}
     * @param offset_color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code Integer}
     */
    @ComMethod(name = "FindMultiColorEx", dispId = 0x9b)
    String FindMultiColorEx(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String first_color,
            String offset_color,
            Double sim,
            Integer dir);
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(88)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param files [in] {@code String}
     * @param delta_color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code Integer}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "FindPic", dispId = 0x9c)
    Integer FindPic(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String files,
            String delta_color,
            Double sim,
            Integer dir,
            VARIANT x,
            VARIANT y);
            
    /**
     * <p>id(0x9d)</p>
     * <p>vtableId(89)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param files [in] {@code String}
     * @param delta_color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code Integer}
     */
    @ComMethod(name = "FindPicEx", dispId = 0x9d)
    String FindPicEx(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String files,
            String delta_color,
            Double sim,
            Integer dir);
            
    /**
     * <p>id(0x9e)</p>
     * <p>vtableId(90)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param files [in] {@code String}
     * @param delta_color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code Integer}
     */
    @ComMethod(name = "FindPicExS", dispId = 0x9e)
    String FindPicExS(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String files,
            String delta_color,
            Double sim,
            Integer dir);
            
    /**
     * <p>id(0x9f)</p>
     * <p>vtableId(91)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param count [in] {@code Integer}
     * @param height [in] {@code Integer}
     * @param width [in] {@code Integer}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "FindColorBlock", dispId = 0x9f)
    Integer FindColorBlock(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String color,
            Double sim,
            Integer count,
            Integer height,
            Integer width,
            VARIANT x,
            VARIANT y);
            
    /**
     * <p>id(0xa0)</p>
     * <p>vtableId(92)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param count [in] {@code Integer}
     * @param height [in] {@code Integer}
     * @param width [in] {@code Integer}
     */
    @ComMethod(name = "FindColorBlockEx", dispId = 0xa0)
    String FindColorBlockEx(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String color,
            Double sim,
            Integer count,
            Integer height,
            Integer width);
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(93)</p>
     * @param str [in] {@code String}
     */
    @ComMethod(name = "GetResultCount", dispId = 0xa1)
    Integer GetResultCount(String str);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(94)</p>
     * @param str [in] {@code String}
     * @param index [in] {@code Integer}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "GetResultPos", dispId = 0xa2)
    Integer GetResultPos(String str,
            Integer index,
            VARIANT x,
            VARIANT y);
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(95)</p>
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     */
    @ComMethod(name = "GetColor", dispId = 0xa3)
    String GetColor(Integer x,
            Integer y);
            
    /**
     * <p>id(0xa4)</p>
     * <p>vtableId(96)</p>
     * @param method [in] {@code String}
     */
    @ComMethod(name = "SetDisplayInput", dispId = 0xa4)
    Integer SetDisplayInput(String method);
            
    /**
     * <p>id(0xa5)</p>
     * <p>vtableId(97)</p>
     * @param pic_name [in] {@code String}
     */
    @ComMethod(name = "LoadPic", dispId = 0xa5)
    Integer LoadPic(String pic_name);
            
    /**
     * <p>id(0xa6)</p>
     * <p>vtableId(98)</p>
     * @param pic_name [in] {@code String}
     */
    @ComMethod(name = "FreePic", dispId = 0xa6)
    Integer FreePic(String pic_name);
            
    /**
     * <p>id(0xa7)</p>
     * <p>vtableId(99)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     */
    @ComMethod(name = "GetScreenData", dispId = 0xa7)
    Integer GetScreenData(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2);
            
    /**
     * <p>id(0xa8)</p>
     * <p>vtableId(100)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param data [out] {@code Object}
     * @param size [out] {@code Object}
     */
    @ComMethod(name = "GetScreenDataBmp", dispId = 0xa8)
    Integer GetScreenDataBmp(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            VARIANT data,
            VARIANT size);
            
    /**
     * <p>id(0xa9)</p>
     * <p>vtableId(101)</p>
     * @param pic_name [in] {@code String}
     */
    @ComMethod(name = "MatchPicName", dispId = 0xa9)
    String MatchPicName(String pic_name);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(102)</p>
     * @param pic_name [in] {@code String}
     * @param data [in] {@code Long}
     * @param size [in] {@code Integer}
     */
    @ComMethod(name = "LoadMemPic", dispId = 0xaa)
    Integer LoadMemPic(String pic_name,
            Long data,
            Integer size);
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(103)</p>
     * @param idx [in] {@code Integer}
     * @param file_name [in] {@code String}
     */
    @ComMethod(name = "SetDict", dispId = 0xc8)
    Integer SetDict(Integer idx,
            String file_name);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(104)</p>
     * @param idx [in] {@code Integer}
     */
    @ComMethod(name = "UseDict", dispId = 0xc9)
    Integer UseDict(Integer idx);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(105)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "Ocr", dispId = 0xca)
    String Ocr(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String color,
            Double sim);
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(106)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "OcrEx", dispId = 0xcb)
    String OcrEx(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String color,
            Double sim);
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(107)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param str [in] {@code String}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param retx [out] {@code Object}
     * @param rety [out] {@code Object}
     */
    @ComMethod(name = "FindStr", dispId = 0xcc)
    Integer FindStr(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String str,
            String color,
            Double sim,
            VARIANT retx,
            VARIANT rety);
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(108)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param str [in] {@code String}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "FindStrEx", dispId = 0xcd)
    String FindStrEx(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String str,
            String color,
            Double sim);
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(109)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "OcrAuto", dispId = 0xce)
    String OcrAuto(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            Double sim);
            
    /**
     * <p>id(0xcf)</p>
     * <p>vtableId(110)</p>
     * @param file_name [in] {@code String}
     * @param color_format [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "OcrFromFile", dispId = 0xcf)
    String OcrFromFile(String file_name,
            String color_format,
            Double sim);
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(111)</p>
     * @param file_name [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "OcrAutoFromFile", dispId = 0xd0)
    String OcrAutoFromFile(String file_name,
            Double sim);
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(112)</p>
     * @param x1 [in] {@code Integer}
     * @param y1 [in] {@code Integer}
     * @param x2 [in] {@code Integer}
     * @param y2 [in] {@code Integer}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "FindLine", dispId = 0xd1)
    String FindLine(Integer x1,
            Integer y1,
            Integer x2,
            Integer y2,
            String color,
            Double sim);
            
    /**
     * <p>id(0xdc)</p>
     * <p>vtableId(113)</p>
     * @param idx [in] {@code Integer}
     * @param data [in] {@code String}
     * @param size [in] {@code Integer}
     */
    @ComMethod(name = "SetMemDict", dispId = 0xdc)
    Integer SetMemDict(Integer idx,
            String data,
            Integer size);
            
    /**
     * <p>id(0xfa)</p>
     * <p>vtableId(114)</p>
     * @param hwnd [in] {@code Integer}
     * @param address [in] {@code String}
     * @param data [in] {@code String}
     * @param size [in] {@code Integer}
     */
    @ComMethod(name = "WriteData", dispId = 0xfa)
    Integer WriteData(Integer hwnd,
            String address,
            String data,
            Integer size);
            
    /**
     * <p>id(0xfb)</p>
     * <p>vtableId(115)</p>
     * @param hwnd [in] {@code Integer}
     * @param address [in] {@code String}
     * @param size [in] {@code Integer}
     */
    @ComMethod(name = "ReadData", dispId = 0xfb)
    String ReadData(Integer hwnd,
            String address,
            Integer size);
            
    
}