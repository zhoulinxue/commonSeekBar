package org.zhx.common.seekbar;

/**
 * @ProjectName: commonSeekBar
 * @Package: org.zhx.common.seekbar
 * @ClassName: SeekParams
 * @Description:java类作用描述
 * @Author: zhouxue
 * @CreateDate: 2020/8/8 14:46
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/8/8 14:46
 * @UpdateRemark: 更新说明
 * @Version:1.0
 */
public class SeekParams {

    SeekParams(CommonSeekBar seekBar) {
        this.seekBar = seekBar;
    }

    //for continuous series seek bar
    // The SeekBar whose progress has changed
    public CommonSeekBar seekBar;
    //The current progress level.The default value for min is 0, max is 100.
    public int progress;
    //The current progress level.The default value for min is 0.0, max is 100.0.
    public float progressFloat;
    //True if the progress change was initiated by the user, otherwise by setProgress() programmatically.
    public boolean fromUser;
    //for discrete series seek bar
    //the thumb location on tick when the section changed, continuous series will be zero.
    public int thumbPosition;
    //the text below tick&thumb when the section changed.
    public String tickText;
}
