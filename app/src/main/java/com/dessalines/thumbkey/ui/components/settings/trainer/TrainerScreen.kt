package com.dessalines.thumbkey.ui.components.settings.trainer

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Circle
import androidx.compose.material.icons.outlined.East
import androidx.compose.material.icons.outlined.North
import androidx.compose.material.icons.outlined.NorthEast
import androidx.compose.material.icons.outlined.NorthWest
import androidx.compose.material.icons.outlined.South
import androidx.compose.material.icons.outlined.SouthEast
import androidx.compose.material.icons.outlined.SouthWest
import androidx.compose.material.icons.outlined.West
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.color
import java.io.File
import kotlin.random.Random

data class InputLogEntry(
    val cellIndex: Int,
    val iconIndex: Int,
    val text: String,
    val timestamp: Long
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TrainerScreen(navController: NavController) {
    Log.d(TAG, "Got to Trainer activity")

    val ctx = LocalContext.current

    val snackbarHostState = remember { SnackbarHostState() }
    val scrollState = rememberScrollState()


    val items = listOf(
        Icons.Outlined.NorthWest,
        Icons.Outlined.North,
        Icons.Outlined.NorthEast,
        Icons.Outlined.West,
        Icons.Outlined.Circle,
        Icons.Outlined.East,
        Icons.Outlined.SouthWest,
        Icons.Outlined.South,
        Icons.Outlined.SouthEast,
    )

    val rows = 3
    val columns = 3
    val totalCells = rows * columns

    // Random cell index
    var randomCellIndex by remember { mutableStateOf(Random.nextInt(totalCells)) }
    var randomNextCellIndex by remember { mutableStateOf(Random.nextInt(totalCells)) }

    // Random icon from your list
    var randomIcon by remember { mutableStateOf(Random.nextInt(items.size)) }
    var randomNextIcon by remember { mutableStateOf(Random.nextInt(items.size)) }

    var text by remember { mutableStateOf("") }

    val logs = remember { mutableStateListOf<InputLogEntry>() }

    val context = LocalContext.current

    LaunchedEffect(text) {
        if (text.isNotEmpty()) {
            logs.add(
                InputLogEntry(
                    cellIndex = randomCellIndex,
                    iconIndex = randomIcon,
                    text = text,
                    timestamp = System.currentTimeMillis()
                )
            )

            // Pick new random cell + icon
            randomCellIndex = randomNextCellIndex
            randomIcon = randomNextIcon
            randomNextCellIndex = Random.nextInt(totalCells)
            randomNextIcon = Random.nextInt(items.size)

            // Clear after handling input (next frame)
            text = ""
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(text = stringResource(R.string.trainer), navController = navController)
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    //.padding(padding)
                    .fillMaxSize()
            ) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(columns), // M columns
                    modifier = Modifier
                        .padding(padding)
                    /*.fillMaxSize(),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)*/
                ) {
                    items(totalCells) { index ->
                        Box(
                            modifier = Modifier
                                .aspectRatio(1f) // square cells
                                .border(1.dp, Color.Black)
                            /*.background(Color.LightGray)*/,
                            contentAlignment = Alignment.Center
                        ) {
                            if (index == randomCellIndex) {
                                Icon(
                                    imageVector = items[randomIcon],
                                    contentDescription = null,
                                    modifier = Modifier.size(64.dp),
                                    tint = Color.Red,
                                )
                            }
                            if (index == randomNextCellIndex) {
                                Icon(
                                    imageVector = items[randomNextIcon],
                                    contentDescription = null,
                                    modifier = Modifier.size(32.dp),
                                    tint = Color.Gray,
                                )
                            }
                        }
                    }
                }
                TextField(
                    modifier =
                        Modifier
                            .fillMaxWidth(),
                    value = text,
                    onValueChange = { newValue ->
                        text = newValue
                    },
                    placeholder = { Text(stringResource(R.string.test_out_thumbkey)) },
                    colors =
                        TextFieldDefaults.colors(
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            disabledContainerColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                        ),
                    //keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Sentences),
                )
                Button(
                    onClick = {
                        val logText = buildString {
                            logs.forEach { entry ->
                                append("${entry.timestamp},${entry.cellIndex},${entry.iconIndex},\"${entry.text}\"\n")
                            }
                        }
                        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                        val clip = ClipData.newPlainText("InputLog", logText)
                        clipboard.setPrimaryClip(clip)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text("Copy Log to Clipboard")
                }
            }
        },
    )
}

@Preview
@Composable
fun TrainerPreview() {
    TrainerScreen(navController = rememberNavController())
}
