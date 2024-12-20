package systemSecurity.weatherOfaMirror.core.status

enum class Area(val des: String, val dust: String){
    SEOU("서울특별시","서울",),
    BUSA("부산광역시","부산"),
    DAEG("대구광역시","대구"),
    INCH("인천광역시","인천"),
    GWAN("광주광역시","광주"),
    DAEJ("대전광역시","대전"),
    ULSA("울산광역시","울산"),
    SEJO("세종시","세종"),
    GYEO("경기도","경기"),
    GANG("강원도","강원"),
    CHUB("충청북도","충북"),
    CHUN("충청남도","충남"),
    JEOB("전라북도","전북"),
    JEON("전라남도","전남"),
    GYUB("경상북도","경북"),
    GYUN("경상남도","경남"),
    JEJU("제주도","제주")
}

enum class ResultCode(val msg: String) {
    SUCCESS("정상 처리 되었습니다."),
    ERROR("에러가 발생했습니다.")
}

enum class ROLE{
    MEMBER
}
