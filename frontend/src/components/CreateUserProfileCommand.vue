<template>
    <v-card outlined>
        <v-card-title>
            CreateUserProfile
        </v-card-title>

        <v-card-text>
            <String label="Username" v-model="value.username" :editMode="editMode"/>
            <Number label="Age" v-model="value.age" :editMode="editMode"/>
            <String label="Gender" v-model="value.gender" :editMode="editMode"/>
            <String label="Interests" v-model="value.interests" :editMode="editMode"/>
            <Address offline label="Address" v-model="value.address" :editMode="editMode" @change="change"/>
            <File offline label="ProfileImage" v-model="value.profileImage" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createUserProfile"
            >
                CreateUserProfile
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateUserProfileCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.username = '';
            this.value.age = 0;
            this.value.gender = '';
            this.value.interests = [];
            this.value.address = {};
            this.value.profileImage = {};
        },
        watch: {
        },
        methods: {
            createUserProfile() {
                this.$emit('createUserProfile', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

