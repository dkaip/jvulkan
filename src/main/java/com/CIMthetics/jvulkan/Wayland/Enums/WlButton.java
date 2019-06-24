/*
 * Copyright 2019 Douglas Kaip
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.CIMthetics.jvulkan.Wayland.Enums;

public enum WlButton
{
    /*
     * These values were obtained from linux/input-event-codes.h
     */
    BTN_0           (0x100),
    BTN_1           (0x101),
    BTN_2           (0x102),
    BTN_3           (0x103),
    BTN_4           (0x104),
    BTN_5           (0x105),
    BTN_6           (0x106),
    BTN_7           (0x107),
    BTN_8           (0x108),
    BTN_9           (0x109),

    BTN_MOUSE       (0x110),
    BTN_LEFT        (0x110),
    BTN_RIGHT       (0x111),
    BTN_MIDDLE      (0x112),
    BTN_SIDE        (0x113),
    BTN_EXTRA       (0x114),
    BTN_FORWARD     (0x115),
    BTN_BACK        (0x116),
    BTN_TASK        (0x117),

    BTN_JOYSTICK    (0x120),
    BTN_TRIGGER     (0x120),
    BTN_THUMB       (0x121),
    BTN_THUMB2      (0x122),
    BTN_TOP         (0x123),
    BTN_TOP2        (0x124),
    BTN_PINKIE      (0x125),
    BTN_BASE        (0x126),
    BTN_BASE2       (0x127),
    BTN_BASE3       (0x128),
    BTN_BASE4       (0x129),
    BTN_BASE5       (0x12a),
    BTN_BASE6       (0x12b),
    BTN_DEAD        (0x12f),

    BTN_GAMEPAD     (0x130),
    BTN_SOUTH       (0x130),
    BTN_A           (BTN_SOUTH.valueOf()),
    BTN_EAST        (0x131),
    BTN_B           (BTN_EAST.valueOf()),
    BTN_C           (0x132),
    BTN_NORTH       (0x133),
    BTN_X           (BTN_NORTH.valueOf()),
    BTN_WEST        (0x134),
    BTN_Y           (BTN_WEST.valueOf()),
    BTN_Z           (0x135),
    BTN_TL          (0x136),
    BTN_TR          (0x137),
    BTN_TL2         (0x138),
    BTN_TR2         (0x139),
    BTN_SELECT      (0x13a),
    BTN_START       (0x13b),
    BTN_MODE        (0x13c),
    BTN_THUMBL      (0x13d),
    BTN_THUMBR      (0x13e),

    BTN_DIGI            (0x140),
    BTN_TOOL_PEN        (0x140),
    BTN_TOOL_RUBBER     (0x141),
    BTN_TOOL_BRUSH      (0x142),
    BTN_TOOL_PENCIL     (0x143),
    BTN_TOOL_AIRBRUSH   (0x144),
    BTN_TOOL_FINGER     (0x145),
    BTN_TOOL_MOUSE      (0x146),
    BTN_TOOL_LENS       (0x147),
    BTN_TOOL_QUINTTAP   (0x148),   /* Five fingers on trackpad */
    BTN_STYLUS3         (0x149),
    BTN_TOUCH           (0x14a),
    BTN_STYLUS          (0x14b),
    BTN_STYLUS2         (0x14c),
    BTN_TOOL_DOUBLETAP  (0x14d),
    BTN_TOOL_TRIPLETAP  (0x14e),
    BTN_TOOL_QUADTAP    (0x14f),   /* Four fingers on trackpad */

    BTN_WHEEL               (0x150),
    BTN_GEAR_DOWN           (0x150),
    BTN_GEAR_UP             (0x151),
    BTN_DPAD_UP             (0x220),
    BTN_DPAD_DOWN           (0x221),
    BTN_DPAD_LEFT           (0x222),
    BTN_DPAD_RIGHT          (0x223),
    BTN_TRIGGER_HAPPY       (0x2c0),
    BTN_TRIGGER_HAPPY1      (0x2c0),
    BTN_TRIGGER_HAPPY2      (0x2c1),
    BTN_TRIGGER_HAPPY3      (0x2c2),
    BTN_TRIGGER_HAPPY4      (0x2c3),
    BTN_TRIGGER_HAPPY5      (0x2c4),
    BTN_TRIGGER_HAPPY6      (0x2c5),
    BTN_TRIGGER_HAPPY7      (0x2c6),
    BTN_TRIGGER_HAPPY8      (0x2c7),
    BTN_TRIGGER_HAPPY9      (0x2c8),
    BTN_TRIGGER_HAPPY10     (0x2c9),
    BTN_TRIGGER_HAPPY11     (0x2ca),
    BTN_TRIGGER_HAPPY12     (0x2cb),
    BTN_TRIGGER_HAPPY13     (0x2cc),
    BTN_TRIGGER_HAPPY14     (0x2cd),
    BTN_TRIGGER_HAPPY15     (0x2ce),
    BTN_TRIGGER_HAPPY16     (0x2cf),
    BTN_TRIGGER_HAPPY17     (0x2d0),
    BTN_TRIGGER_HAPPY18     (0x2d1),
    BTN_TRIGGER_HAPPY19     (0x2d2),
    BTN_TRIGGER_HAPPY20     (0x2d3),
    BTN_TRIGGER_HAPPY21     (0x2d4),
    BTN_TRIGGER_HAPPY22     (0x2d5),
    BTN_TRIGGER_HAPPY23     (0x2d6),
    BTN_TRIGGER_HAPPY24     (0x2d7),
    BTN_TRIGGER_HAPPY25     (0x2d8),
    BTN_TRIGGER_HAPPY26     (0x2d9),
    BTN_TRIGGER_HAPPY27     (0x2da),
    BTN_TRIGGER_HAPPY28     (0x2db),
    BTN_TRIGGER_HAPPY29     (0x2dc),
    BTN_TRIGGER_HAPPY30     (0x2dd),
    BTN_TRIGGER_HAPPY31     (0x2de),
    BTN_TRIGGER_HAPPY32     (0x2df),
    BTN_TRIGGER_HAPPY33     (0x2e0),
    BTN_TRIGGER_HAPPY34     (0x2e1),
    BTN_TRIGGER_HAPPY35     (0x2e2),
    BTN_TRIGGER_HAPPY36     (0x2e3),
    BTN_TRIGGER_HAPPY37     (0x2e4),
    BTN_TRIGGER_HAPPY38     (0x2e5),
    BTN_TRIGGER_HAPPY39     (0x2e6),
    BTN_TRIGGER_HAPPY40     (0x2e7);


    private int value;
    
    private WlButton(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    public static WlButton fromValue(int inputValue)
    {
        WlButton result = null;
        
        switch(inputValue)
        {
            case 0x100:
                result = BTN_0;
                break;
            case 0x101:
                result = BTN_1;
                break;
            case 0x102:
                result = BTN_2;
                break;
            case 0x103:
                result = BTN_3;
                break;
            case 0x104:
                result = BTN_4;
                break;
            case 0x105:
                result = BTN_5;
                break;
            case 0x106:
                result = BTN_6;
                break;
            case 0x107:
                result = BTN_7;
                break;
            case 0x108:
                result = BTN_8;
                break;
            case 0x109:
                result = BTN_9;
                break;
            case 0x110:
                result = BTN_LEFT;
                break;
            case 0x111:
                result = BTN_RIGHT;
                break;
            case 0x112:
                result = BTN_MIDDLE;
                break;
            case 0x113:
                result = BTN_SIDE;
                break;
            case 0x114:
                result = BTN_EXTRA;
                break;
            case 0x115:
                result = BTN_FORWARD;
                break;
            case 0x116:
                result = BTN_BACK;
                break;
            case 0x117:
                result = BTN_TASK;
                break;
            case 0x120:
                result = BTN_TRIGGER;
                break;
            case 0x121:
                result = BTN_THUMB;
                break;
            case 0x122:
                result = BTN_THUMB2;
                break;
            case 0x123:
                result = BTN_TOP;
                break;
            case 0x124:
                result = BTN_TOP2;
                break;
            case 0x125:
                result = BTN_PINKIE;
                break;
            case 0x126:
                result = BTN_BASE;
                break;
            case 0x127:
                result = BTN_BASE2;
                break;
            case 0x128:
                result = BTN_BASE3;
                break;
            case 0x129:
                result = BTN_BASE4;
                break;
            case 0x12a:
                result = BTN_BASE5;
                break;
            case 0x12b:
                result = BTN_BASE6;
                break;
            case 0x12f:
                result = BTN_DEAD;
                break;
            case 0x130:
                result = BTN_SOUTH;
                break;
            case 0x131:
                result = BTN_EAST;
                break;
            case 0x132:
                result = BTN_C;
                break;
            case 0x133:
                result = BTN_NORTH;
                break;
            case 0x134:
                result = BTN_WEST;
                break;
            case 0x135:
                result = BTN_Z;
                break;
            case 0x136:
                result = BTN_TL;
                break;
            case 0x137:
                result = BTN_TR;
                break;
            case 0x138:
                result = BTN_TL2;
                break;
            case 0x139:
                result = BTN_TR2;
                break;
            case 0x13a:
                result = BTN_SELECT;
                break;
            case 0x13b:
                result = BTN_START;
                break;
            case 0x13c:
                result = BTN_MODE;
                break;
            case 0x13d:
                result = BTN_THUMBL;
                break;
            case 0x13e:
                result = BTN_THUMBR;
                break;
            case 0x140:
                result = BTN_TOOL_PEN;
                break;
            case 0x141:
                result = BTN_TOOL_RUBBER;
                break;
            case 0x142:
                result = BTN_TOOL_BRUSH;
                break;
            case 0x143:
                result = BTN_TOOL_PENCIL;
                break;
            case 0x144:
                result = BTN_TOOL_AIRBRUSH;
                break;
            case 0x145:
                result = BTN_TOOL_FINGER;
                break;
            case 0x146:
                result = BTN_TOOL_MOUSE;
                break;
            case 0x147:
                result = BTN_TOOL_LENS;
                break;
            case 0x148:
                result = BTN_TOOL_QUINTTAP;
                break;
            case 0x149:
                result = BTN_STYLUS3;
                break;
            case 0x14a:
                result = BTN_TOUCH;
                break;
            case 0x14b:
                result = BTN_STYLUS;
                break;
            case 0x14c:
                result = BTN_STYLUS2;
                break;
            case 0x14d:
                result = BTN_TOOL_DOUBLETAP;
                break;
            case 0x14e:
                result = BTN_TOOL_TRIPLETAP;
                break;
            case 0x14f:
                result = BTN_TOOL_QUADTAP;
                break;
            case 0x150:
                result = BTN_GEAR_DOWN;
                break;
            case 0x151:
                result = BTN_GEAR_UP;
                break;
            case 0x220:
                result = BTN_DPAD_UP;
                break;
            case 0x221:
                result = BTN_DPAD_DOWN;
                break;
            case 0x222:
                result = BTN_DPAD_LEFT;
                break;
            case 0x223:
                result = BTN_DPAD_RIGHT;
                break;
            case 0x2c0:
                result = BTN_TRIGGER_HAPPY1;
                break;
            case 0x2c1:
                result = BTN_TRIGGER_HAPPY2;
                break;
            case 0x2c2:
                result = BTN_TRIGGER_HAPPY3;
                break;
            case 0x2c3:
                result = BTN_TRIGGER_HAPPY4;
                break;
            case 0x2c4:
                result = BTN_TRIGGER_HAPPY5;
                break;
            case 0x2c5:
                result = BTN_TRIGGER_HAPPY6;
                break;
            case 0x2c6:
                result = BTN_TRIGGER_HAPPY7;
                break;
            case 0x2c7:
                result = BTN_TRIGGER_HAPPY8;
                break;
            case 0x2c8:
                result = BTN_TRIGGER_HAPPY9;
                break;
            case 0x2c9:
                result = BTN_TRIGGER_HAPPY10;
                break;
            case 0x2ca:
                result = BTN_TRIGGER_HAPPY11;
                break;
            case 0x2cb:
                result = BTN_TRIGGER_HAPPY12;
                break;
            case 0x2cc:
                result = BTN_TRIGGER_HAPPY13;
                break;
            case 0x2cd:
                result = BTN_TRIGGER_HAPPY14;
                break;
            case 0x2ce:
                result = BTN_TRIGGER_HAPPY15;
                break;
            case 0x2cf:
                result = BTN_TRIGGER_HAPPY16;
                break;
            case 0x2d0:
                result = BTN_TRIGGER_HAPPY17;
                break;
            case 0x2d1:
                result = BTN_TRIGGER_HAPPY18;
                break;
            case 0x2d2:
                result = BTN_TRIGGER_HAPPY19;
                break;
            case 0x2d3:
                result = BTN_TRIGGER_HAPPY20;
                break;
            case 0x2d4:
                result = BTN_TRIGGER_HAPPY21;
                break;
            case 0x2d5:
                result = BTN_TRIGGER_HAPPY22;
                break;
            case 0x2d6:
                result = BTN_TRIGGER_HAPPY23;
                break;
            case 0x2d7:
                result = BTN_TRIGGER_HAPPY24;
                break;
            case 0x2d8:
                result = BTN_TRIGGER_HAPPY25;
                break;
            case 0x2d9:
                result = BTN_TRIGGER_HAPPY26;
                break;
            case 0x2da:
                result = BTN_TRIGGER_HAPPY27;
                break;
            case 0x2db:
                result = BTN_TRIGGER_HAPPY28;
                break;
            case 0x2dc:
                result = BTN_TRIGGER_HAPPY29;
                break;
            case 0x2dd:
                result = BTN_TRIGGER_HAPPY30;
                break;
            case 0x2de:
                result = BTN_TRIGGER_HAPPY31;
                break;
            case 0x2df:
                result = BTN_TRIGGER_HAPPY32;
                break;
            case 0x2e0:
                result = BTN_TRIGGER_HAPPY33;
                break;
            case 0x2e1:
                result = BTN_TRIGGER_HAPPY34;
                break;
            case 0x2e2:
                result = BTN_TRIGGER_HAPPY35;
                break;
            case 0x2e3:
                result = BTN_TRIGGER_HAPPY36;
                break;
            case 0x2e4:
                result = BTN_TRIGGER_HAPPY37;
                break;
            case 0x2e5:
                result = BTN_TRIGGER_HAPPY38;
                break;
            case 0x2e6:
                result = BTN_TRIGGER_HAPPY39;
                break;
            case 0x2e7:
                result = BTN_TRIGGER_HAPPY40;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
