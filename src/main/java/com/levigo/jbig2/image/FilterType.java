/**
 * Copyright (C) 1995-2015 levigo holding gmbh.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.levigo.jbig2.image;


/**
 * A FilterType enum for defining certain downscale filters to apply.
 */
public enum FilterType {
  Bessel,
  Blackman,
  Box,
  Catrom,
  Cubic,
  Gaussian,
  Hamming,
  Hanning,
  Hermite,
  Lanczos,
  Mitchell,
  Point,
  Quadratic,
  Sinc,
  Triangle;

  private static FilterType defaultFilter = Triangle;

  public static void setDefaultFilterType(FilterType defaultFilter) {
    FilterType.defaultFilter = defaultFilter;
  }

  public static FilterType getDefaultFilterType() {
    return defaultFilter;
  }
}