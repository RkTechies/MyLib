package com.beautybebo.libs.views.specials.in;

import android.animation.ObjectAnimator;
import android.view.View;

import com.beautybebo.libs.views.BaseViewAnimator;
import com.beautybebo.libs.easing.Glider;
import com.beautybebo.libs.easing.Skill;

public class LandingAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                Glider.glide(Skill.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "scaleX", 1.5f, 1f)),
                Glider.glide(Skill.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "scaleY", 1.5f, 1f)),
                Glider.glide(Skill.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "alpha", 0, 1f))
        );
    }
}
