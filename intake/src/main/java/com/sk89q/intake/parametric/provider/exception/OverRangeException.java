/*
 * Intake, a command processing library
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) Intake team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.intake.parametric.provider.exception;

import com.sk89q.intake.argument.ArgumentParseException;

/**
 * Thrown when a numerical input is larger than the expected maximum.
 */
public class OverRangeException extends ArgumentParseException {

  private final Number input;
  private final Number maximum;

  public OverRangeException(Number input, Number maximum) {
    super(String.format("A valid value is less than or equal to %s (you entered %s)", maximum, input));
    this.input = input;
    this.maximum = maximum;
  }

  public Number getInput() {
    return input;
  }

  public Number getMaximum() {
    return maximum;
  }
}
