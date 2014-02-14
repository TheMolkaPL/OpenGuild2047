/*
 * The MIT License
 *
 * Copyright 2014 Grzegorz.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package pl.grzegorz2047.openguild2047;

import pl.grzegorz2047.openguild2047.api.PlayerGuild;

/**
 *
 * @author Grzegorz
 */
public class SimplePlayerGuild implements PlayerGuild{
    /*
        Ta klasa bedzie potrzebna, ale jak to wszystko 
        jakos logicznie ogarnac to jeszcze nie wiem xd
    */
    private String playername;
    private String clantag;
    private boolean leader;
    
    
    public SimplePlayerGuild(String playername, String tag, boolean leader){
        this.playername=playername;
        this.clantag=tag;
        this.leader=leader;
    }

    @Override
    public String getPlayerName() {
        return this.playername;
    }

    @Override
    public String getClanTag() {
        return this.clantag;
    }

    @Override
    public boolean isLeader() {
        return this.leader;
    }
    
    
    
    
}
