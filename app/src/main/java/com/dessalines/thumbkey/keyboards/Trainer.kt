@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_TRAINER_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    topLeft = KeyC("\u0100", display=KeyDisplay.TextDisplay("↖")),
                    top = KeyC("\u0101", display=KeyDisplay.TextDisplay("↑")),
                    topRight = KeyC("\u0102", display=KeyDisplay.TextDisplay("↗")),
                    left = KeyC("\u0103", display=KeyDisplay.TextDisplay("←")),
                    center = KeyC("\u0104", size = LARGE, display=KeyDisplay.TextDisplay("○")),
                    right = KeyC("\u0105", display=KeyDisplay.TextDisplay("→")),
                    bottomLeft = KeyC("\u0106", display=KeyDisplay.TextDisplay("↙")),
                    bottom = KeyC("\u0107", display=KeyDisplay.TextDisplay(" ↓")),
                    bottomRight = KeyC("\u0108", display=KeyDisplay.TextDisplay("↘")),
                ),
                KeyItemC(
                    topLeft = KeyC("\u0109", display=KeyDisplay.TextDisplay("↖")),
                    top = KeyC("\u010A", display=KeyDisplay.TextDisplay("↑")),
                    topRight = KeyC("\u010B", display=KeyDisplay.TextDisplay("↗")),
                    left = KeyC("\u010C", display=KeyDisplay.TextDisplay("←")),
                    center = KeyC("\u010D", size = LARGE, display=KeyDisplay.TextDisplay("○")),
                    right = KeyC("\u010E", display=KeyDisplay.TextDisplay("→")),
                    bottomLeft = KeyC("\u010F", display=KeyDisplay.TextDisplay("↙")),
                    bottom = KeyC("\u0110", display=KeyDisplay.TextDisplay(" ↓")),
                    bottomRight = KeyC("\u0111", display=KeyDisplay.TextDisplay("↘")),
                ),
                KeyItemC(
                    topLeft = KeyC("\u0112", display=KeyDisplay.TextDisplay("↖")),
                    top = KeyC("\u0113", display=KeyDisplay.TextDisplay("↑")),
                    topRight = KeyC("\u0114", display=KeyDisplay.TextDisplay("↗")),
                    left = KeyC("\u0115", display=KeyDisplay.TextDisplay("←")),
                    center = KeyC("\u0116", size = LARGE, display=KeyDisplay.TextDisplay("○")),
                    right = KeyC("\u0117", display=KeyDisplay.TextDisplay("→")),
                    bottomLeft = KeyC("\u0118", display=KeyDisplay.TextDisplay("↙")),
                    bottom = KeyC("\u0119", display=KeyDisplay.TextDisplay(" ↓")),
                    bottomRight = KeyC("\u011A", display=KeyDisplay.TextDisplay("↘")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    topLeft = KeyC("\u011B", display=KeyDisplay.TextDisplay("↖")),
                    top = KeyC("\u011C", display=KeyDisplay.TextDisplay("↑")),
                    topRight = KeyC("\u011D", display=KeyDisplay.TextDisplay("↗")),
                    left = KeyC("\u011E", display=KeyDisplay.TextDisplay("←")),
                    center = KeyC("\u011F", size = LARGE, display=KeyDisplay.TextDisplay("○")),
                    right = KeyC("\u0120", display=KeyDisplay.TextDisplay("→")),
                    bottomLeft = KeyC("\u0121", display=KeyDisplay.TextDisplay("↙")),
                    bottom = KeyC("\u0122", display=KeyDisplay.TextDisplay(" ↓")),
                    bottomRight = KeyC("\u0123", display=KeyDisplay.TextDisplay("↘")),
                ),
                KeyItemC(
                    topLeft = KeyC("\u0124", display=KeyDisplay.TextDisplay("↖")),
                    top = KeyC("\u0125", display=KeyDisplay.TextDisplay("↑")),
                    topRight = KeyC("\u0126", display=KeyDisplay.TextDisplay("↗")),
                    left = KeyC("\u0127", display=KeyDisplay.TextDisplay("←")),
                    center = KeyC("\u0128", size = LARGE, display=KeyDisplay.TextDisplay("○")),
                    right = KeyC("\u0129", display=KeyDisplay.TextDisplay("→")),
                    bottomLeft = KeyC("\u012A", display=KeyDisplay.TextDisplay("↙")),
                    bottom = KeyC("\u012B", display=KeyDisplay.TextDisplay(" ↓")),
                    bottomRight = KeyC("\u012C", display=KeyDisplay.TextDisplay("↘")),
                ),
                KeyItemC(
                    topLeft = KeyC("\u012D", display=KeyDisplay.TextDisplay("↖")),
                    top = KeyC("\u012E", display=KeyDisplay.TextDisplay("↑")),
                    topRight = KeyC("\u012F", display=KeyDisplay.TextDisplay("↗")),
                    left = KeyC("\u0130", display=KeyDisplay.TextDisplay("←")),
                    center = KeyC("\u0131", size = LARGE, display=KeyDisplay.TextDisplay("○")),
                    right = KeyC("\u0132", display=KeyDisplay.TextDisplay("→")),
                    bottomLeft = KeyC("\u0133", display=KeyDisplay.TextDisplay("↙")),
                    bottom = KeyC("\u0134", display=KeyDisplay.TextDisplay(" ↓")),
                    bottomRight = KeyC("\u0135", display=KeyDisplay.TextDisplay("↘")),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    topLeft = KeyC("\u0136", display=KeyDisplay.TextDisplay("↖")),
                    top = KeyC("\u0137", display=KeyDisplay.TextDisplay("↑")),
                    topRight = KeyC("\u0138", display=KeyDisplay.TextDisplay("↗")),
                    left = KeyC("\u0139", display=KeyDisplay.TextDisplay("←")),
                    center = KeyC("\u013A", size = LARGE, display=KeyDisplay.TextDisplay("○")),
                    right = KeyC("\u013B", display=KeyDisplay.TextDisplay("→")),
                    bottomLeft = KeyC("\u013C", display=KeyDisplay.TextDisplay("↙")),
                    bottom = KeyC("\u013D", display=KeyDisplay.TextDisplay(" ↓")),
                    bottomRight = KeyC("\u013E", display=KeyDisplay.TextDisplay("↘")),
                ),
                KeyItemC(
                    topLeft = KeyC("\u013F", display=KeyDisplay.TextDisplay("↖")),
                    top = KeyC("\u0140", display=KeyDisplay.TextDisplay("↑")),
                    topRight = KeyC("\u0141", display=KeyDisplay.TextDisplay("↗")),
                    left = KeyC("\u0142", display=KeyDisplay.TextDisplay("←")),
                    center = KeyC("\u0143", size = LARGE, display=KeyDisplay.TextDisplay("○")),
                    right = KeyC("\u0144", display=KeyDisplay.TextDisplay("→")),
                    bottomLeft = KeyC("\u0145", display=KeyDisplay.TextDisplay("↙")),
                    bottom = KeyC("\u0146", display=KeyDisplay.TextDisplay(" ↓")),
                    bottomRight = KeyC("\u0147", display=KeyDisplay.TextDisplay("↘")),
                ),
                KeyItemC(
                    topLeft = KeyC("\u0148", display=KeyDisplay.TextDisplay("↖")),
                    top = KeyC("\u0149", display=KeyDisplay.TextDisplay("↑")),
                    topRight = KeyC("\u014A", display=KeyDisplay.TextDisplay("↗")),
                    left = KeyC("\u014B", display=KeyDisplay.TextDisplay("←")),
                    center = KeyC("\u014C", size = LARGE, display=KeyDisplay.TextDisplay("○")),
                    right = KeyC("\u014D", display=KeyDisplay.TextDisplay("→")),
                    bottomLeft = KeyC("\u014E", display=KeyDisplay.TextDisplay("↙")),
                    bottom = KeyC("\u014F", display=KeyDisplay.TextDisplay(" ↓")),
                    bottomRight = KeyC("\u0150", display=KeyDisplay.TextDisplay("↘")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TRAINER: KeyboardDefinition =
    KeyboardDefinition(
        title = "trainer",
        modes =
            KeyboardDefinitionModes(
                main = KB_TRAINER_MAIN,
                shifted = KB_TRAINER_MAIN,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
