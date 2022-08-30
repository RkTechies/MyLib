package com.beautybebo.libs.easing;


import com.beautybebo.libs.easing.bounce.BounceEaseOut;
import com.beautybebo.libs.easing.quint.QuintEaseOut;
import com.beautybebo.libs.easing.sine.SineEaseInOut;

public enum Skill {

    BounceEaseOut(BounceEaseOut.class),

    QuintEaseOut(QuintEaseOut.class),

    SineEaseInOut(SineEaseInOut.class);

    private Class easingMethod;

    private Skill(Class clazz) {
        easingMethod = clazz;
    }

    public BaseEasingMethod getMethod(float duration) {
        try {
            return (BaseEasingMethod) easingMethod.getConstructor(float.class).newInstance(duration);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
    }
