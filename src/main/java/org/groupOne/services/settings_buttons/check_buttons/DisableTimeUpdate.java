package org.groupOne.services.settings_buttons.check_buttons;

import static org.groupOne.services.button_enum.ButtonName.*;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;

public class DisableTimeUpdate {

    public KeyboardButton sendTimeUpdateMenu(boolean check) {

        if (check) {
            return KeyboardButton.builder().text(TIME_UPDATE_ENABLE.getButtonName()).build();
        } else {
            return KeyboardButton.builder().text(TIME_UPDATE_DISABLE.getButtonName()).build();
        }
    }
}
