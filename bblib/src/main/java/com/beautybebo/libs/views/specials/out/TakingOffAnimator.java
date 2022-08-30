package com.beautybebo.libs.views.specials.out;

import android.animation.ObjectAnimator;
import android.view.View;

import com.beautybebo.libs.views.BaseViewAnimator;
import com.beautybebo.libs.easing.Glider;
import com.beautybebo.libs.easing.Skill;

public class TakingOffAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                Glider.glide(Skill.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "scaleX", 1f, 1.5f)),
                Glider.glide(Skill.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "scaleY", 1f, 1.5f)),
                Glider.glide(Skill.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "alpha", 1, 0))
        );
    }
}
