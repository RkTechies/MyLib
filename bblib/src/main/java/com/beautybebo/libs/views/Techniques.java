
/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 daimajia
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.beautybebo.libs.views;

import com.beautybebo.libs.views.attention.BounceAnimator;
import com.beautybebo.libs.views.attention.FlashAnimator;
import com.beautybebo.libs.views.attention.PulseAnimator;
import com.beautybebo.libs.views.attention.RubberBandAnimator;
import com.beautybebo.libs.views.attention.ShakeAnimator;
import com.beautybebo.libs.views.attention.StandUpAnimator;
import com.beautybebo.libs.views.attention.SwingAnimator;
import com.beautybebo.libs.views.attention.TadaAnimator;
import com.beautybebo.libs.views.attention.WaveAnimator;
import com.beautybebo.libs.views.attention.WobbleAnimator;
import com.beautybebo.libs.views.bouncing_entrances.BounceInAnimator;
import com.beautybebo.libs.views.bouncing_entrances.BounceInDownAnimator;
import com.beautybebo.libs.views.bouncing_entrances.BounceInLeftAnimator;
import com.beautybebo.libs.views.bouncing_entrances.BounceInRightAnimator;
import com.beautybebo.libs.views.bouncing_entrances.BounceInUpAnimator;
import com.beautybebo.libs.views.fading_entrances.FadeInAnimator;
import com.beautybebo.libs.views.fading_entrances.FadeInDownAnimator;
import com.beautybebo.libs.views.fading_entrances.FadeInLeftAnimator;
import com.beautybebo.libs.views.fading_entrances.FadeInRightAnimator;
import com.beautybebo.libs.views.fading_entrances.FadeInUpAnimator;
import com.beautybebo.libs.views.fading_exits.FadeOutAnimator;
import com.beautybebo.libs.views.fading_exits.FadeOutDownAnimator;
import com.beautybebo.libs.views.fading_exits.FadeOutLeftAnimator;
import com.beautybebo.libs.views.fading_exits.FadeOutRightAnimator;
import com.beautybebo.libs.views.fading_exits.FadeOutUpAnimator;
import com.beautybebo.libs.views.flippers.FlipInXAnimator;
import com.beautybebo.libs.views.flippers.FlipInYAnimator;
import com.beautybebo.libs.views.flippers.FlipOutXAnimator;
import com.beautybebo.libs.views.flippers.FlipOutYAnimator;
import com.beautybebo.libs.views.rotating_entrances.RotateInAnimator;
import com.beautybebo.libs.views.rotating_entrances.RotateInDownLeftAnimator;
import com.beautybebo.libs.views.rotating_entrances.RotateInDownRightAnimator;
import com.beautybebo.libs.views.rotating_entrances.RotateInUpLeftAnimator;
import com.beautybebo.libs.views.rotating_entrances.RotateInUpRightAnimator;
import com.beautybebo.libs.views.rotating_exits.RotateOutAnimator;
import com.beautybebo.libs.views.rotating_exits.RotateOutDownLeftAnimator;
import com.beautybebo.libs.views.rotating_exits.RotateOutDownRightAnimator;
import com.beautybebo.libs.views.rotating_exits.RotateOutUpLeftAnimator;
import com.beautybebo.libs.views.rotating_exits.RotateOutUpRightAnimator;
import com.beautybebo.libs.views.sliders.SlideInDownAnimator;
import com.beautybebo.libs.views.sliders.SlideInLeftAnimator;
import com.beautybebo.libs.views.sliders.SlideInRightAnimator;
import com.beautybebo.libs.views.sliders.SlideInUpAnimator;
import com.beautybebo.libs.views.sliders.SlideOutDownAnimator;
import com.beautybebo.libs.views.sliders.SlideOutLeftAnimator;
import com.beautybebo.libs.views.sliders.SlideOutRightAnimator;
import com.beautybebo.libs.views.sliders.SlideOutUpAnimator;
import com.beautybebo.libs.views.specials.HingeAnimator;
import com.beautybebo.libs.views.specials.RollInAnimator;
import com.beautybebo.libs.views.specials.RollOutAnimator;
import com.beautybebo.libs.views.specials.in.DropOutAnimator;
import com.beautybebo.libs.views.specials.in.LandingAnimator;
import com.beautybebo.libs.views.specials.out.TakingOffAnimator;
import com.beautybebo.libs.views.zooming_entrances.ZoomInAnimator;
import com.beautybebo.libs.views.zooming_entrances.ZoomInDownAnimator;
import com.beautybebo.libs.views.zooming_entrances.ZoomInLeftAnimator;
import com.beautybebo.libs.views.zooming_entrances.ZoomInRightAnimator;
import com.beautybebo.libs.views.zooming_entrances.ZoomInUpAnimator;
import com.beautybebo.libs.views.zooming_exits.ZoomOutAnimator;
import com.beautybebo.libs.views.zooming_exits.ZoomOutDownAnimator;
import com.beautybebo.libs.views.zooming_exits.ZoomOutLeftAnimator;
import com.beautybebo.libs.views.zooming_exits.ZoomOutRightAnimator;
import com.beautybebo.libs.views.zooming_exits.ZoomOutUpAnimator;

public enum Techniques {

    DropOut(DropOutAnimator.class),
    Landing(LandingAnimator.class),
    TakingOff(TakingOffAnimator.class),

    Flash(FlashAnimator.class),
    Pulse(PulseAnimator.class),
    RubberBand(RubberBandAnimator.class),
    Shake(ShakeAnimator.class),
    Swing(SwingAnimator.class),
    Wobble(WobbleAnimator.class),
    Bounce(BounceAnimator.class),
    Tada(TadaAnimator.class),
    StandUp(StandUpAnimator.class),
    Wave(WaveAnimator.class),

    Hinge(HingeAnimator.class),
    RollIn(RollInAnimator.class),
    RollOut(RollOutAnimator.class),

    BounceIn(BounceInAnimator.class),
    BounceInDown(BounceInDownAnimator.class),
    BounceInLeft(BounceInLeftAnimator.class),
    BounceInRight(BounceInRightAnimator.class),
    BounceInUp(BounceInUpAnimator.class),

    FadeIn(FadeInAnimator.class),
    FadeInUp(FadeInUpAnimator.class),
    FadeInDown(FadeInDownAnimator.class),
    FadeInLeft(FadeInLeftAnimator.class),
    FadeInRight(FadeInRightAnimator.class),

    FadeOut(FadeOutAnimator.class),
    FadeOutDown(FadeOutDownAnimator.class),
    FadeOutLeft(FadeOutLeftAnimator.class),
    FadeOutRight(FadeOutRightAnimator.class),
    FadeOutUp(FadeOutUpAnimator.class),

    FlipInX(FlipInXAnimator.class),
    FlipOutX(FlipOutXAnimator.class),
    FlipInY(FlipInYAnimator.class),
    FlipOutY(FlipOutYAnimator.class),
    RotateIn(RotateInAnimator.class),
    RotateInDownLeft(RotateInDownLeftAnimator.class),
    RotateInDownRight(RotateInDownRightAnimator.class),
    RotateInUpLeft(RotateInUpLeftAnimator.class),
    RotateInUpRight(RotateInUpRightAnimator.class),

    RotateOut(RotateOutAnimator.class),
    RotateOutDownLeft(RotateOutDownLeftAnimator.class),
    RotateOutDownRight(RotateOutDownRightAnimator.class),
    RotateOutUpLeft(RotateOutUpLeftAnimator.class),
    RotateOutUpRight(RotateOutUpRightAnimator.class),

    SlideInLeft(SlideInLeftAnimator.class),
    SlideInRight(SlideInRightAnimator.class),
    SlideInUp(SlideInUpAnimator.class),
    SlideInDown(SlideInDownAnimator.class),

    SlideOutLeft(SlideOutLeftAnimator.class),
    SlideOutRight(SlideOutRightAnimator.class),
    SlideOutUp(SlideOutUpAnimator.class),
    SlideOutDown(SlideOutDownAnimator.class),

    ZoomIn(ZoomInAnimator.class),
    ZoomInDown(ZoomInDownAnimator.class),
    ZoomInLeft(ZoomInLeftAnimator.class),
    ZoomInRight(ZoomInRightAnimator.class),
    ZoomInUp(ZoomInUpAnimator.class),

    ZoomOut(ZoomOutAnimator.class),
    ZoomOutDown(ZoomOutDownAnimator.class),
    ZoomOutLeft(ZoomOutLeftAnimator.class),
    ZoomOutRight(ZoomOutRightAnimator.class),
    ZoomOutUp(ZoomOutUpAnimator.class);



    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
