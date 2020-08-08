package org.zhx.common.seekbar;

import android.content.Context;
import android.util.TypedValue;

/**
 * @ProjectName: commonSeekBar
 * @Package: org.zhx.common.seekbar
 * @ClassName: DenyUtils
 * @Description:java类作用描述
 * @Author: zhouxue
 * @CreateDate: 2020/8/8 14:46
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/8/8 14:46
 * @UpdateRemark: 更新说明
 * @Version:1.0
 */
public class DenyUtils {
    public static int dp2px(Context context, float dpValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, context.getResources().getDisplayMetrics());
    }

    public static int sp2px(Context context, float spValue) {
        return (int) (spValue * context.getResources().getDisplayMetrics().scaledDensity + 0.5f);
    }

    public static int px2sp(Context context, float pxValue) {
        return (int) (pxValue / context.getResources().getDisplayMetrics().scaledDensity + 0.5f);
    }

}
