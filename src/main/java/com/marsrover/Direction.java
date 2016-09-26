package com.marsrover;

public enum Direction {
	N(0,1){
		@Override
		public Direction right() {
			return E;
		}

		@Override
		public Direction left() {
			return W;
		}	
	},
	E(1,0){
		@Override
		public Direction right() {		
			return S;
		}

		@Override
		public Direction left() {
			return N;
		}
		
	},
	S(0,-1){
		@Override
		public Direction right() {
			return W;
		}

		@Override
		public Direction left() {
			return E;
		}
		
	},
	W(-1,0){
		@Override
		public Direction right() {
			return N;
		}

		@Override
		public Direction left() {
			return S;
		}	
	};

	public abstract Direction right();
	public abstract Direction left();
	private int stepSizeOnXAxis, stepSizeOnYAxis;
	
	Direction(final int stepSizeOnXAxis, final int stepSizeOnYAxis){
		this.stepSizeOnXAxis = stepSizeOnXAxis;
		this.stepSizeOnYAxis = stepSizeOnYAxis;
	}
	
	public int getStepSizeOnXAxis(){
		return this.stepSizeOnXAxis;
	}
	
	public int getStepSizeOnYAxis(){
		return this.stepSizeOnYAxis;
	}
}
