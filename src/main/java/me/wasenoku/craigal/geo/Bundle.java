/*
 * Copyright © 2017 Wasenoku
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package me.wasenoku.craigal.geo;





/**
 * Bundles craigslist site information together so
 * that future queries are more efficient.
 *
 * @author Wasenoku
 * @version 1.0
 * @since 1.0
 */

public class Bundle
{
    private final GeoList list;

    public Bundle(GeoList list)
    {
        this.list = list;
    }
}