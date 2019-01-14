/*
 * Copyright (C) 2018 owner
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

package security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class Hasher
{
    private final static char [] hexAlphabet = "0123456789ABCDEF".toCharArray();

    public static String hash(String password)
            throws NoSuchAlgorithmException
    {
        MessageDigest messageDig = MessageDigest.getInstance("MD5");
        messageDig.update(password.getBytes());
        byte[] digest = messageDig.digest();
        return bytesToHex(digest);
    }

    public static String bytesToHex(byte[] bytes)
    {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexAlphabet[v >>> 4];
            hexChars[j * 2 + 1] = hexAlphabet[v & 0x0F];
        }
        return new String(hexChars);
    }

}
