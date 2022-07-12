package com.careerit.cj.coursestats;

public class CountStatDto {

		private Long placedCount;
		private Long notPlacedCount;
		
		public CountStatDto(Long placedCount, Long notPlacedCount) {
			this.placedCount = placedCount;
			this.notPlacedCount = notPlacedCount;
		}
		public Long getPlacedCount() {
			return placedCount;
		}
		public void setPlacedCount(Long placedCount) {
			this.placedCount = placedCount;
		}
		public Long getNotPlacedCount() {
			return notPlacedCount;
		}
		public void setNotPlacedCount(Long notPlacedCount) {
			this.notPlacedCount = notPlacedCount;
		}
		
		
}
