package com.easyhz.daypet.home.view.calendar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.easyhz.daypet.domain.model.home.Thumbnail
import com.kizitonwose.calendar.compose.WeekCalendar
import com.kizitonwose.calendar.compose.weekcalendar.WeekCalendarState
import java.time.LocalDate

@Composable
internal fun HomeWeekCalendar(
    modifier: Modifier = Modifier,
    weekState: WeekCalendarState,
    currentDate: LocalDate,
    selection: LocalDate,
    thumbnail: Thumbnail,
    onChangedDate: (LocalDate) -> Unit
) {
    WeekCalendar(
        state = weekState,
        weekHeader = { CalendarHeader() },
        dayContent = {day ->
            Day(
                dayType = DayType.Week(day),
                thumbnail = thumbnail,
                isSelected = selection == day.date,
                isCurrentDate = currentDate == day.date
            ) { clickedDay ->
                onChangedDate(clickedDay)
            }
        },
        modifier = modifier
    )
}