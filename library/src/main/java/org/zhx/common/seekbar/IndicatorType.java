package org.zhx.common.seekbar;

/**
 * @ProjectName: commonSeekBar
 * @Package: org.zhx.common.seekbar
 * @ClassName: IndicatorType
 * @Description:java类作用描述
 * @Author: zhouxue
 * @CreateDate: 2020/8/8 14:46
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/8/8 14:46
 * @UpdateRemark: 更新说明
 * @Version:1.0
 */
public interface IndicatorType {
    /**
     * don't have indicator to show.
     */
    int NONE = 0;
    /**
     * the indicator shape like water-drop
     */
    int CIRCULAR_BUBBLE = 1;

    /**
     * the indicator corners is rounded shape
     */
    int ROUNDED_RECTANGLE = 2;

    /**
     * the indicator corners is square shape
     */
    int RECTANGLE = 3;

    /**
     * set custom indicator you want
     */
    int CUSTOM = 4;

}