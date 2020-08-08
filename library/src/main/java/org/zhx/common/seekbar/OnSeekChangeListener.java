package org.zhx.common.seekbar;

/**
 * @ProjectName: commonSeekBar
 * @Package: org.zhx.common.seekbar
 * @ClassName: OnSeekChangeListener
 * @Description:java类作用描述
 * @Author: zhouxue
 * @CreateDate: 2020/8/8 14:46
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/8/8 14:46
 * @UpdateRemark: 更新说明
 * @Version:1.0
 */
public interface OnSeekChangeListener {
    /**
     * Notification that the progress level has changed.
     * <p>
     * Clients can use the fromUser parameter to distinguish user-initiated changes from
     * those that occurred programmatically, also, if the seek bar type is discrete series,
     * clients can use the thumbPosition parameter to check the thumb position on ticks and
     * tick text parameter to get the tick text which located at current thumb below.
     *
     * @param seekParams the params info about the seeking bar
     */
    void onSeeking(SeekParams seekParams);

    /**
     * Notification that the user has started a touch gesture. Clients may want to use this
     * to disable advancing the seek bar.
     *
     * @param seekBar The SeekBar in which the touch gesture began
     */
    void onStartTrackingTouch(CommonSeekBar seekBar);

    /**
     * Notification that the user has finished a touch gesture. Clients may want to use this
     * to re-enable advancing the seek bar.
     *
     * @param seekBar The SeekBar in which the touch gesture began
     */
    void onStopTrackingTouch(CommonSeekBar seekBar);
}