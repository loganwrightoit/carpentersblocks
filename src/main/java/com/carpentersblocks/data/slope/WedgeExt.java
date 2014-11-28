package com.carpentersblocks.data.slope;

import com.carpentersblocks.data.Slope;
import com.carpentersblocks.data.SlopeType;

public class WedgeExt extends SlopeType {

	@Override
	public int onHammerLeftClick(Slope slope, int slopeID) {
		if (slope.isPositive) {
            if (++slopeID > Slope.ID_WEDGE_EXT_POS_SW) {
                slopeID = Slope.ID_WEDGE_EXT_POS_SE;
            }
        } else {
            if (++slopeID > Slope.ID_WEDGE_EXT_NEG_SW) {
                slopeID = Slope.ID_WEDGE_EXT_NEG_SE;
            }
        }
		return slopeID;
	}

	@Override
	public int onHammerRightClick(Slope slope, int slopeID) {
		if (slope.isPositive) {
            slopeID -= 4;
        } else {
            slopeID += 12;
        }
		return slopeID;
	}

}
