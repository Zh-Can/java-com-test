
package op.java.example;

import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({12BEC402-A06E-4FAD-A7D4-830F967374C6})</p>
 * <p>interface(IOpInterface)</p>
 */
@ComObject(clsId = "{12BEC402-A06E-4FAD-A7D4-830F967374C6}")
public interface OpInterface extends IUnknown
    ,IOpInterface
{

}