package org.zhx.indicatorseekbar.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import com.warkiz.indicatorseekbar.R;

import org.zhx.common.seekbar.CommonSeekBar;
import org.zhx.common.seekbar.CommoneStayLayout;
import org.zhx.common.seekbar.IndicatorType;
import org.zhx.common.seekbar.TickMarkType;

/**
 * @ProjectName: commonSeekBar
 * @Package: org.zhx.indicatorseekbar.fragment
 * @ClassName: NewAddFragment
 * @Description:java类作用描述
 * @Author: zhouxue
 * @CreateDate: 2020/8/12 18:54
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/8/12 18:54
 * @UpdateRemark: 更新说明
 * @Version:1.0
 */
public class NewAddFragment extends BaseFragment {
    private CommonSeekBar mBar;
    private ViewGroup mContainer;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_new_add_layout;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mContainer=view.findViewById(R.id.seek_bar_layout);
        super.onViewCreated(view, savedInstanceState);
        String[] array_ends = new String[]{"500", "", "", "", "900"};
        CommonSeekBar.Builder mBuilder = new CommonSeekBar.Builder(getActivity())
                .max(Integer.valueOf(array_ends[array_ends.length - 1]))
                .min(Integer.valueOf(array_ends[0]))
                .progress(Integer.valueOf(array_ends[0]))
                .tickCount(array_ends.length)
                .showTickMarksType(TickMarkType.TEXT)
                .tickTextsArray(array_ends)
                .showTickTexts(true)
                .showIndicatorType(IndicatorType.ROUNDED_RECTANGLE)
                .trackProgressColor(getResources().getColor(R.color.color_FF5DA0))
                .trackProgressSize(25)
                .trackBackgroundColor(getResources().getColor(R.color.color_FFC4DC))
                .trackBackgroundSize(25)
                .tickTextsColor(getResources().getColor(R.color.color_white))
                .PaddingTop(10)
                .trackRoundedCorners(true);
        CommoneStayLayout stayLayout = new CommoneStayLayout(getActivity());
        mBar = mBuilder.build();
        mBar.hideThumb(true);
        stayLayout.attachTo(mBar);
        mContainer.removeAllViews();
        mContainer.addView(stayLayout);
    }
}
